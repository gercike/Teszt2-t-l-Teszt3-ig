package Zoo;

public class Dog extends Mammal {
    public Dog(String name, String gender, int age) {
        super(name, gender, age);
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Vau!");
    }

    public void playWith() {
        System.out.println(name + " is playing.");
    }
}
