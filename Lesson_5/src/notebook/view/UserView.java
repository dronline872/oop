package notebook.view;

import notebook.controller.UserController;
import notebook.model.User;
import notebook.util.Commands;

import java.util.List;
import java.util.Scanner;

public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com;

        while (true) {
            String command = prompt("Введите команду: ");
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) {
                userController.saveOnExit();
                return;
            }
            switch (com) {
                case CREATE:
                    String firstName = prompt("Имя: ");
                    String lastName = prompt("Фамилия: ");
                    String phone = prompt("Номер телефона: ");
                    userController.saveUser(new User(firstName, lastName, phone));
                    break;
                case READ:
                    String id = prompt("Введите идентификатор пользователя: ");
                    try {
                        User user = userController.readUser(Long.parseLong(id));
                        System.out.println(user);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case LIST:
                    try {
                        List<User> users = userController.readAllUsers();
                        System.out.println(users);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case UPDATE:
                    try {
                        String name  = prompt("Имя: ");
                        String secondName = prompt("Фамилия: ");
                        String number = prompt("Номер телефона: ");
                        Long userid = Long.parseLong(prompt("Введите идентификатор пользователя: "));
                        User updated = new User(name, secondName, number);
                        userController.updateUser(userid, updated);


                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                case DELETE:
                    try {
                        Long userid = Long.parseLong(prompt("Введите идентификатор пользователя: "));
                        userController.deleteUser(userid);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                default:
                    break;
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
