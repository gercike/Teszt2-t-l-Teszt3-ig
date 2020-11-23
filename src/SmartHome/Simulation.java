package SmartHome;

public class Simulation {
    public static void main(String[] args) {
        SmartHome sh = new SmartHome();
        System.out.println(sh);
        sh.homeController.turnHeatingOn(sh);
        System.out.println(sh);
        sh.homeController.dehumidificate(sh);
        System.out.println(sh);
        sh.homeController.closeAllWindowsAndDoors(sh);
        System.out.println(sh);
        sh.homeController.fireAlarm(sh);
        System.out.println(sh);
    }
}
