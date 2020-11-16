package Zoo;

public class Cat extends Mammal {
    private boolean isDomesticated;

    public Cat(String name, String gender, int age, boolean isDomesticated) {
        super(name, gender, age);
        this.isDomesticated = isDomesticated;
    }

    public Cat(String name, boolean isDomesticated) {
        super(name);
        this.isDomesticated = isDomesticated;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
