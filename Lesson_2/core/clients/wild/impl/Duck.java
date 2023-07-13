package Lesson_2.core.clients.wild.impl;

import java.time.LocalDate;

import Lesson_2.core.clients.Flyable;
import Lesson_2.core.clients.Runnable;
import Lesson_2.core.clients.Soundable;
import Lesson_2.core.clients.Swimmable;
import Lesson_2.core.clients.owners.Owner;
import Lesson_2.core.clients.wild.WildAnimal;

public class Duck extends WildAnimal implements Flyable, Runnable, Soundable, Swimmable {
    public Duck() {
    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + " летит со скоростью: 5 км/ч");
        return 5;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " ходит со скоростью: 3 км/ч");
        return 3;
    }

    @Override
    public int sound() {
        System.out.println(CLASS_NAME + " звучит со скоростью 10 км/ч");
        return 10;
    }

    @Override
    public int swim() {
         System.out.println(CLASS_NAME + " плавает со скоростью 10 км/ч");
        return 10;
    }
}
