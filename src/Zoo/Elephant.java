package Zoo;

public class Elephant extends Mammal{
    public Elephant(String name, String gender, int age) {
        super(name, gender, age);
    }

    public Elephant(String name) {
        super(name);
    }

    @Override
    public boolean isHungry() {

        return false; //ide kell még valami
    }

    @Override
    public void makeSound() {
        System.out.println("Tarantara!");
    }
}
