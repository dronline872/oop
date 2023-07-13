package Lesson_2;

import java.time.LocalDate;

import Lesson_2.core.clients.home.impl.Dog;
import Lesson_2.core.VetClinic;
import Lesson_2.core.clients.home.impl.Cat;
import Lesson_2.core.clients.owners.Owner;
import Lesson_2.core.clients.wild.impl.Duck;
import Lesson_2.core.clients.wild.impl.Eagle;
import Lesson_2.core.clients.wild.impl.WildCat;
import Lesson_2.core.personal.Doctor;
import Lesson_2.core.personal.Nurse;

/**
 * Небольшая шпаргалка по синтаксису java:
 * 
 * 1) Названия классов в java - существительные с большой буквы верблюжьей
 * нотацией: CamelCase;
 * 2) названия методов - отглагольные, с маленькой буквы, верблюжьей нотацией:
 * getUserById;
 * 3) Названия переменных - существительные с маленькой буквы, верблюжьей
 * нотацией: maxCount;
 * 4) названия пакетов в java существительные, всегда с маленькой буквы и в одно
 * слово;
 * -! Если логика классов внутри пакета не позволяет назвать все в одно
 * существительное, надо вложить один пакет в другой.
 */
public class Main {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();

        Dog dog = new Dog();
        dog.swim();
        dog.run();
        vetClinic.addAnimal(dog);

        WildCat wildCat = new WildCat();
        wildCat.swim();
        wildCat.sound();
        wildCat.run();
        vetClinic.addAnimal(wildCat);

        Duck duck = new Duck();
        duck.swim();
        duck.sound();
        duck.run();
        duck.fly();
        vetClinic.addAnimal(duck);

        Cat cat = new Cat();
        cat.run();
        vetClinic.addAnimal(cat);

        Eagle eagle = new Eagle();
        eagle.setName("решка");
        eagle.sound();
        eagle.fly();
        vetClinic.addAnimal(eagle);

        System.out.println("----------------------------------------");
        System.out.println("Доктор");
        Doctor doctor = new Doctor();
        eagle.visitDoctor(doctor);
        System.out.println("----------------------------------------");
        System.out.println("Медсестра");
        Nurse nurse = new Nurse();
        eagle.visitNurse(nurse);
        System.out.println("----------------------------------------");
        System.out.println("Животные в клинике по группам:");
        System.out.println("Все бегающие:");
        System.out.println(VetClinic.getAllRunners());
        System.out.println("Все плавающие:");
        System.out.println(VetClinic.getAllSwimmers());
        System.out.println("Все говорящие:");
        System.out.println(VetClinic.getAllTalkers());
        System.out.println("Все летающие:");
        System.out.println(VetClinic.getFlyPatients());
    }
}
