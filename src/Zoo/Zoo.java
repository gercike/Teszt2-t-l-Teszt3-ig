package Zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static List<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
//        Dog blöki = new Dog("blöki", "bernáthegyi", "házi", 87);
//        animals.add(blöki);
//        Dog vahúr = new Dog("vahúr", "németjuhász", "házi", 5);
//        animals.add(vahúr);
//        Cat cicu = new Cat("cicu", "cirmos", "házi", 8, true);
//        animals.add(cicu);
//        Canary minimadár = new Canary("minimadár", "kanári", "dzsungel", 4, 3);
//        animals.add(minimadár);
//        Parrot lóri = new Parrot("lóri", "papagáj", "dzsungel", 5, 30);
//        animals.add(lóri);
//        Cat macsek = new Cat("macsek", "sziámi", "házi", 2, true);
//        animals.add(macsek);
//        Cat vadmacska = new Cat("vadmacska", "párducmacska", "dzsungel", 5, false);
        System.out.println(animals); //2. feladat
//        makeThemMakeSound(zoo); //3. feladat
        zoo.playWithDogs(animals);
//        System.out.println(zoo.countBirdsInZoo(animals));

    }

    public void playWithDogs(List<Animal> zoo) {
        for (Animal animal : zoo) {
            if (animal.getClass().toString().contains("Dog")) {
                ((Dog) animal).playWith();
            }
        }
    }

    public int countMammalsInZoo(List<Animal> zoo){
        int nrOfMammals = 0;
        for (Animal animal : zoo) {
            if (animal.getClass().getSuperclass().toString().contains("Mammal")){
                nrOfMammals++;
            }
        }
        return nrOfMammals;
    }

    public int countBirdsInZoo(List<Animal> zoo) {
        int nrOfBirsd = 0;
        for (Animal animal : zoo) {
            if (animal.getClass().getSuperclass().toString().contains("Bird")){
                nrOfBirsd++;
            }
        }
        return nrOfBirsd;
    }

    public void makeThemMakeSound(List<Animal> zoo) {
        for (Animal animal : zoo) {
            animal.makeSound();
        }
    }
}
