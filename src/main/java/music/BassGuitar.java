package main.java.music;

public class BassGuitar extends StringedInstrument {
    public BassGuitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public BassGuitar() {
        this.numberOfStrings = 4;
    }

    @Override
    public void sound() {
        System.out.print("Duum-duum-duum");
    }
}
