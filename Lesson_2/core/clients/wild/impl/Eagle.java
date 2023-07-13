package Lesson_2.core.clients.wild.impl;

import Lesson_2.core.clients.Animal;
import Lesson_2.core.clients.Animals;
import Lesson_2.core.clients.Flyable;
import Lesson_2.core.clients.Soundable;

public class Eagle extends Animal implements Flyable,  Soundable, Animals  {
    public Eagle() {
        super();
    }

    @Override
    public int sound() {
        System.out.println(CLASS_NAME + " поет со скоростью 10 км/ч");
        return 10;
    }

    @Override
    public int fly() {
      System.out.println(CLASS_NAME + " летает со скоростью 60 км/ч");
        return 60;
    }
}
