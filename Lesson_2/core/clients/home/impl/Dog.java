package Lesson_2.core.clients.home.impl;

import java.time.LocalDate;

import Lesson_2.core.clients.Runnable;
import Lesson_2.core.clients.Swimmable;
import Lesson_2.core.clients.home.Pet;
import Lesson_2.core.clients.owners.Owner;

/**
 * Одна из реализаций домашнего животного
 */
public class Dog extends Pet implements Swimmable, Runnable {
    public Dog() {
    }

    public Dog(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + " плавает со скоростью 10 км/ч");
        return 10;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " бегает со скоростью 50 км/ч");
        return 50;
    }
}
