package Vehicles;

public class VehicleApp {
    public static void main(String[] args) {
        Car raceCar = new SportCar();
        raceCar.maxSpeed = 260;
        VehicleApp main = new VehicleApp();
        System.out.println(main.getTargetCustomer(raceCar));
    }
    public String getTargetCustomer(Vehicle v){
        String message = null;
        if (v.getMaxSpeed()>200){
            message = "Ez sportautóként használható.";
        }
        if (v.getNrOfSeats()>5){
            message = "Ez nagycsaládosoknak ajánlható.";
        }
        return message;
    }
}
