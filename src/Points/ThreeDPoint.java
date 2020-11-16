package Points;

public class ThreeDPoint extends TwoDPoint {
    private double z;

    @Override
    public void get2xDistance() {
        z = z * 2;
    }
}
