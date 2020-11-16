package Zoo;

public class Canary extends Bird {
    public Canary(String name, String gender, int age) {
        super(name, gender, age);
    }

    public Canary(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Csip!");
    }
}
