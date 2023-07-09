package Lesson_1;

public class Bird extends Animal {
    public Bird(String color, String species, Integer legsCount) {
        super(color, species,  legsCount);
    }

    @Override
    public void swim() {
        System.out.println("The bird doesn't swim.");
    }
}
