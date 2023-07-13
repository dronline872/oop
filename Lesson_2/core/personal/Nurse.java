package Lesson_2.core.personal;

import Lesson_2.core.clients.Animal;

public class Nurse {
    public void takeVitals(Animal animal) {
        System.out.println("Измерение основных показателей у " + animal.getName() + "...");
        System.out.println("Основные показатели измерены и записаны для " + animal.getName() + ".");
    }

    public void administerMedication(Animal animal) {
        System.out.println("Подача лекарств для " + animal.getName() + "...");
        System.out.println("Лекарства поданы для " + animal.getName() + ".");
    }

    public void assistDoctor(Animal animal) {
        System.out.println("Помощь ветеринару во время процедур для " + animal.getName() + "...");
        System.out.println("Помощь оказана для " + animal.getName() + ".");
    }

    public void provideComfort(Animal animal) {
        System.out.println("Обеспечение ухода для " + animal.getName() + "...");
        System.out.println("Уход обеспечен для " + animal.getName() + ".");
    }

    public void educateOwners(Animal animal) {
        System.out.println("Обучение владельца " + animal.getName() + "...");
        System.out.println("Обучение предоставлено владельцу " + animal.getName() + ".");
    }
}