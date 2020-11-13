package VacuumCleaner;

public class Frontend {
    public static void main(String[] args) {
        VacuumCleaner hoover = new VacuumCleaner(150);
        hoover.cleaning(30, 20, true, true);

    }
}
