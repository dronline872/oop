package Lesson_2.core.clients.owners;

import java.util.ArrayList;
import java.util.List;

import Lesson_2.core.clients.Animal;
import Lesson_2.core.clients.Human;

/**
 * Хозяин животного, пациента клиники
 */
public class Owner extends Human {

    private final List<Animal> pets; // питомцы, которых человек принес в клинику

    public Owner(String fullName) {
        super(fullName);
        this.pets = new ArrayList<>();
    }

    public List<Animal> getPets() {
        return pets;
    }
}
