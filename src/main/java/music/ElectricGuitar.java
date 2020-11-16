package main.java.music;

public class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public ElectricGuitar() {
        this.numberOfStrings = 6;
    }

    @Override
    public void sound() {
        System.out.print("Twang");
    }
}
