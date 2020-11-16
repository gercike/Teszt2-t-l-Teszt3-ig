package Zoo;

public abstract class Animal {
    protected String name;
    protected String gender;
    protected String species;
    protected String biome;
    protected int age;
    protected int fedTimes;

    public Animal(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Animal(String name) {
        this.name = name;
        this.age = 1;
        this.gender = "unknown";
    }

    public void eat() {
        fedTimes++;
    }

    public boolean isHungry() {
        return (fedTimes == 0);
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return name + " is a " + age + " years old, " + gender + " animal, and was fed " + fedTimes + " times";
    }

}
