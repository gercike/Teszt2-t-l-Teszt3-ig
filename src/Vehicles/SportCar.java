package Vehicles;

public class SportCar extends Car{
    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public int getNrOfSeats() {
        return 0;
    }

    @Override
    public int getBootCapacity() {
        return 0;
    }

    @Override
    public int calcPrice(int age) {
        return 0;
    }
}
