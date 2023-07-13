package Lesson_2.core.clients.home;

import java.time.LocalDate;

import Lesson_2.core.clients.Animal;
import Lesson_2.core.clients.Animals;
import Lesson_2.core.clients.owners.Owner;

/**
 * Абстракция домашнего животного
 */
public class Pet extends Animal implements Animals {
    public Pet() {
    }

    public Pet(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
}
