package Zoo;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    protected List<Animal> animalsToLookAfter;
    private String name;

    public Worker(List<Animal> animalsToLookAfter, String name) {
        this.animalsToLookAfter = animalsToLookAfter;
        this.name = name;
    }

    public Worker(String name) {
        this.animalsToLookAfter = new ArrayList<Animal>();
        this.name = name;
    }

    public void doDailyRoutine() {
        for (Animal animal : animalsToLookAfter) {
            if (animal.isHungry()){
                animal.eat();
            }
        }
    }
}
