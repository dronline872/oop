package Lesson_1;


public class Animal {
    private String name;
    private Integer age;
    private String vaccination;
    private String color;
    private String species;
    private Owner owner;
    private Integer legsCount;

    public Animal(String name, Integer age, String vaccination, String color,
            String species, Owner owner, Integer legsCount) {
        this.name = name;
        this.age = age;
        this.vaccination = vaccination;
        this.color = color;
        this.species = species;
        this.owner = owner;
        this.legsCount = legsCount;
    }

    public Animal(String color, String species, Integer legsCount) {
        this(null, null, null, color, species, null, legsCount);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void toGo() {
        System.out.println("Animal is moving.");
    }

    public void fly() {
        System.out.println("Animal is flying.");
    }

    public void swim() {
        System.out.println("Animal is swimming.");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Animal: {name = %s, owner = %s}", name, owner);
    }
}
