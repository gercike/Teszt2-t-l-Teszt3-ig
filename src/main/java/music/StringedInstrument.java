package main.java.music;

public abstract class StringedInstrument extends Instrument {
    protected int numberOfStrings;

    public void sound() {
    }

    @Override
    public void play() {
        System.out.print(name + ", a " + numberOfStrings + "-stringed");
        super.play();
        sound();
        System.out.print("\n");
    }
}
