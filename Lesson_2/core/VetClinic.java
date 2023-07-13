package Lesson_2.core;

import java.util.ArrayList;
import java.util.List;

import Lesson_2.core.clients.Animals;
import Lesson_2.core.clients.Flyable;
import Lesson_2.core.clients.Soundable;
import Lesson_2.core.clients.Swimmable;
import Lesson_2.core.clients.Runnable;

public class VetClinic {
    private static List<Animals> animals = new ArrayList<>();


    private static void heal(Animals patients) {
        System.out.println(patients.getClassName() + " вылечен");
    }

    public List<Animals> addAnimal(Animals patient) {
        animals.add(patient);
        return animals;
    }

    public static List<Animals> getAllRunners() {
        List<Animals> runners = new ArrayList<>();
        for (Animals element : animals) {
            if (element instanceof Runnable) {

                runners.add(element);
            }
        }

        return runners;
    }

    public static List<Animals> getAllSwimmers() {
        List<Animals> swimmers = new ArrayList<>();
        for (Animals element : animals) {
            if (element instanceof Swimmable) {
                swimmers.add(element);
            }
        }

        return swimmers;
    }

    public static List<Animals> getAllTalkers() {
        List<Animals> talkers = new ArrayList<>();
        for (Animals element : animals) {
            if (element instanceof Soundable) {
                talkers.add(element);
            }
        }

        return talkers;
    }

    public static List<Animals> getFlyPatients() {
        List<Animals> flyers = new ArrayList<>();
        for (Animals element : animals) {
            if (element instanceof Flyable) {
                flyers.add(element);
            }
        }

        return flyers;
    }

}
