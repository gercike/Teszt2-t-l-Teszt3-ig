package Zoo;

public class Lion extends Mammal {


    public Lion(String name, String gender, int age) {
        super(name, gender, age);
    }

    public Lion(String name) {
        super(name);
    }

    @Override
    public boolean isHungry() {
        return true;
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }
}
