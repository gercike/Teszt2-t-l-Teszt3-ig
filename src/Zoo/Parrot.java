package Zoo;

public class Parrot extends Bird {

    public Parrot(String name, String gender, int age) {
        super(name, gender, age);
    }

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Shut up!");
    }
}
