package Zoo;

public abstract class Bird extends Animal {
    protected double wingSpan;

    public Bird(String name, String gender, int age) {
        super(name, gender, age);
    }

    public Bird(String name) {
        super(name);
    }
}
