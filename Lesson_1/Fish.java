package Lesson_1;

public class Fish extends Animal {
    public Fish(String color, String species, Integer legsCount) {
        super(color, species, legsCount);
    }

    @Override
    public void fly() {
        System.out.println("The fish doesn't fly.");
    }

    @Override
    public void toGo() {
        System.out.println("The fish does not walk.");
    }
}
