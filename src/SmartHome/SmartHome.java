package SmartHome;

import java.util.Arrays;

public class SmartHome implements House {
    HeatingStatus heatingStatus;
    GroundFloor groundFloor;
    Upstairs upstairs;
    HomeController homeController;

    public SmartHome() {
        homeController = new HomeController();
        heatingStatus = HeatingStatus.OFF;
        groundFloor = new GroundFloor();
        groundFloor.windowsList = Arrays.asList(new BigWindow(), groundFloor.frontDoor, new SmallWindow(), new BigWindow());
        upstairs = new Upstairs();
        upstairs.windowsList = Arrays.asList(new BigWindow(), new SmallWindow(), new SmallWindow(), new SmallWindow(), new BigWindow());
    }

    @Override
    public String toString() {
        System.out.println(printHeatingStatus());
        for (DoorsAndWindows doorsAndWindows : upstairs.windowsList) {
            System.out.print(doorsAndWindows.getStatus() + " ");
        }
        System.out.println();
        for (DoorsAndWindows doorsAndWindows : groundFloor.windowsList) {
            System.out.print(doorsAndWindows.getStatus() + " ");
        }
        return "";
    }

    @Override
    public void turnHeatingOff() {
        heatingStatus = HeatingStatus.OFF;
    }

    @Override
    public void turnHeatingOn() {
        heatingStatus = HeatingStatus.ON;
    }

    public String printHeatingStatus() {
        return heatingStatus.status;
    }

    @Override
    public void openDoor() {
        this.groundFloor.frontDoor.status = WindowStatus.OPEN;
    }

    @Override
    public void closeDoor() {
        this.groundFloor.frontDoor.status = WindowStatus.CLOSED;
    }
}
