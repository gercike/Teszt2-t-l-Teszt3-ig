package Bicycle;

public class Bicycle {
    private double kerekmeret;
    private int fogaskerek;
    private int[] hatsoFogaskerekek;

    public Bicycle() {
    }

    public Bicycle(double kerekmeret, int fogaskerek, int[] hatsoFogaskerekek) {
        this.kerekmeret = kerekmeret;
        this.fogaskerek = fogaskerek;
        this.hatsoFogaskerekek = hatsoFogaskerekek;
    }

    public double getKerekmeret() {
        return kerekmeret;
    }

    public void setKerekmeret(double kerekmeret) {
        this.kerekmeret = kerekmeret;
    }

    public int getFogaskerek() {
        return fogaskerek;
    }

    public void setFogaskerek(int fogaskerek) {
        this.fogaskerek = fogaskerek;
    }

    public int[] getHatsoFogaskerekek() {
        return hatsoFogaskerekek;
    }

    public void setHatsoFogaskerekek(int[] hatsoFogaskerekek) {
        this.hatsoFogaskerekek = hatsoFogaskerekek;
    }

    public double kerekmeretInM (double kerekmeretInInch){
        double kerekmeretInM = kerekmeretInInch*0.0254;
        return kerekmeretInM;
    }

    public double getSpeed(double fordulatPerSec, int fokozat) {
        double speed = fogaskerek/hatsoFogaskerekek[fokozat-1]*fordulatPerSec*kerekmeretInM(kerekmeret)*Math.PI*3.6;
        return speed;
    }

    public double getFordulatPerSec(double speed, int fokozat) {
        double fordulat = speed*hatsoFogaskerekek[fokozat-1]/fogaskerek/kerekmeretInM(kerekmeret)/Math.PI/3.6;
        return fordulat;
    }

}
