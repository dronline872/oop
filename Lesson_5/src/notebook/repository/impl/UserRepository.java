package notebook.repository.impl;

import notebook.mapper.impl.UserMapper;
import notebook.model.User;
import notebook.repository.GBRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import java.io.*;

public class UserRepository implements GBRepository<User, Long> {
    private final UserMapper mapper;
    private final String fileName;
    private final List<String> dataBuffer;

    public UserRepository(String fileName) {
        this.mapper = new UserMapper();
        this.fileName = fileName;
        this.dataBuffer = new ArrayList<>();
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<User> findAll() {
        List<String> lines = readAll();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.toOutput(line));
        }
        return users;
    }

    @Override
    public User create(User user) {
        List<User> users = findAll();
        long max = 0L;
        for (User u : users) {
            long id = u.getId();
            if (max < id) {
                max = id;
            }
        }
        long next = max + 1;
        user.setId(next);
        users.add(user);
        dataBuffer.add(mapper.toInput(user));
        return user;
    }

/*     @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    } */

    @Override
    public Optional<User> update(Long id, User user) {
        List<User> users = findAll();
        User editUser = users.stream()
                .filter(u -> u.getId()
                        .equals(id))
                .findFirst().orElseThrow(() -> new RuntimeException("User not found"));
        editUser.setId(id);
        editUser.setFirstName(user.getFirstName());
        editUser.setPhone(user.getPhone());
        editUser.setLastName(user.getLastName());
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        List<User> users = findAll();
        boolean removed = false;

        for (User user : users) {
            if (user.getId().equals(id)) {
                users.remove(user);
                removed = true;
                break;
            }
        }

        return removed;
    }

    @Override
    public List<String> readAll() {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

    @Override
    public void saveOnExit() {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            for (String line : dataBuffer) {
                writer.write(line);
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
