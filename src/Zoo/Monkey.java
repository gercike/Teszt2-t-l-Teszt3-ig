package Zoo;

public class Monkey extends Mammal {
    public Monkey(String name, String gender, int age) {
        super(name, gender, age);
    }

    public Monkey(String name) {
        super(name);
    }

    @Override
    public boolean isHungry() {
        return (Math.random() >= 0.5);
    }

    @Override
    public void makeSound() {
        System.out.println("Mak-mak!");
    }
}
