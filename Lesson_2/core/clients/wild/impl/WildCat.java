package Lesson_2.core.clients.wild.impl;

import java.time.LocalDate;

import Lesson_2.core.clients.owners.Owner;
import Lesson_2.core.clients.wild.WildAnimal;
import Lesson_2.core.clients.Runnable;
import Lesson_2.core.clients.Soundable;
import Lesson_2.core.clients.Swimmable;

/**
 * Одна из реализаций дикого животного
 */
public class WildCat extends WildAnimal implements Runnable, Soundable, Swimmable {
    public WildCat() {
    }

    public WildCat(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " бегает со скоростью 15 км/ч");
        return 15;
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
