package VacuumCleaner;

public class VacuumCleaner {
    private boolean isPluggedIn;
    private boolean isTurnedOn;
    private double dustbagCapacity;
    private double dustLevelInBag;

    public VacuumCleaner() {
    }

    public VacuumCleaner(int dustbagCapacity) {
        this.dustbagCapacity = dustbagCapacity;
        this.dustLevelInBag = 0;
    }

    public boolean isPluggedIn() {
        return isPluggedIn;
    }

    public void setPluggedIn(boolean pluggedIn) {
        isPluggedIn = pluggedIn;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
    }

    public double getDustbagCapacity() {
        return dustbagCapacity;
    }

    public void setDustbagCapacity(double dustbagCapacity) {
        this.dustbagCapacity = dustbagCapacity;
    }

    public double getDustLevelInBag() {
        return dustLevelInBag;
    }

    public void setDustLevelInBag(double dustLevelInBag) {
        this.dustLevelInBag = dustLevelInBag;
    }

    public void changeDustbag() {
        setDustLevelInBag(0);
    }

    public void cleaning(int duration, int dirtiness, boolean isPluggedIn, boolean isTurnedOn) {
        if (isPluggedIn && isTurnedOn && dustLevelInBag < dustbagCapacity) {
            for (int i = 0; i < duration || dustLevelInBag < dustbagCapacity; i++) {
                dustbagCapacity += dirtiness;
                if (dustLevelInBag == dustbagCapacity) {
                    System.out.println("Tele van a porzsák.");
                    setTurnedOn(false);
                    break;
                }
                if (i == duration - 1) {
                    System.out.println("A porszívózás befejeződött.");
                    System.out.println("A porzsák telítettsége: " + 100/(dustbagCapacity/dustLevelInBag) + "%");
                    setTurnedOn(false);
                }
            }
        } else if (dustLevelInBag == dustbagCapacity) {
            System.out.println("Tele van a porzsák.");
            setTurnedOn(false);
        } else System.out.println("Tanácstalanul állsz a porszívó felett, ami el sem indul. Azt kívánod, hogy " +
                "bárcsak okosporszívót vettél volna, és akkor tudnád, hogy mi a baja.");
    }
}

