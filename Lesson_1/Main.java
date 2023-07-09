package Lesson_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cat:");
        Cat cat = new Cat(null, null, null);
        cat.toGo();
        cat.fly();
        cat.swim();
        System.out.println("Fish:");
        Fish fish = new Fish(null, null, null);
        fish.toGo();
        fish.fly();
        fish.swim();
        System.out.println("Bird:");
        Bird bird = new Bird(null, null, null);
        bird.toGo();
        bird.fly();
        bird.swim();
    }
}
