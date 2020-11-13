package VacuumCleaner;

public class WetVacuumCleaner extends VacuumCleaner{
    private double waterLevel;


    public WetVacuumCleaner(int dustbagCapacity, double waterLevel) {
        super(dustbagCapacity);
        this.waterLevel = waterLevel;
    }

    public double getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(double waterLevel) {
        this.waterLevel = waterLevel;
    }

    public void moppingUp (double roomSizeInSqM){
        for (int i = 0; i < roomSizeInSqM; i++) {
            setWaterLevel(getWaterLevel()-1);
            if (i==roomSizeInSqM-1){
                System.out.println("Felmosás befejeződött.");
                System.out.println("A víztartály a víz szintje: " + getWaterLevel()+ " liter.");
            }
        }
    }
}
