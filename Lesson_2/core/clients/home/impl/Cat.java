package Lesson_2.core.clients.home.impl;

import java.time.LocalDate;

import Lesson_2.core.clients.home.Pet;
import Lesson_2.core.clients.owners.Owner;
import Lesson_2.core.clients.Runnable;

/**
 * Одна из реализаций домашнего животного
 */
public class Cat extends Pet implements Runnable {
    public Cat() {
    }

    public Cat(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " ходит со скоростью: 30 км/ч");
        return 30;
    }
}
