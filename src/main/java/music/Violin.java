package main.java.music;

public class Violin extends StringedInstrument {
    public Violin() {
        numberOfStrings = 4;
    }

    @Override
    public void sound() {
        System.out.print("Screech");
    }
}
