package Zoo;

public abstract class Mammal extends Animal {

    public Mammal(String name, String gender, int age) {
        super(name, gender, age);
    }

    public Mammal(String name) {
        super(name);
    }
}
