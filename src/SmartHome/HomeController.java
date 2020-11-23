package SmartHome;

public class HomeController {

    public void closeAllWindowsAndDoors(SmartHome sh) {
        System.out.println("HomeController: closing all windows and doors");
        for (DoorsAndWindows doorsAndWindows : sh.groundFloor.windowsList) {
            doorsAndWindows.close();
        }
        for (DoorsAndWindows doorsAndWindows : sh.upstairs.windowsList) {
            doorsAndWindows.close();
        }
    }

    public void dehumidificate(SmartHome sh) {
        System.out.println("HomeController: opening all small windows");
        for (DoorsAndWindows doorsAndWindows : sh.groundFloor.windowsList) {
            if (doorsAndWindows.getClass().getSimpleName().contains("Small")) {
                doorsAndWindows.open();
            } else {
                doorsAndWindows.close();
            }
        }
        for (DoorsAndWindows doorsAndWindows : sh.upstairs.windowsList) {
            if (doorsAndWindows.getClass().getSimpleName().contains("Small")) {
                doorsAndWindows.open();
            } else {
                doorsAndWindows.close();
            }
        }
    }

    public void turnHeatingOn(SmartHome sh) {
        System.out.println("HomeController: turning heating on");
        if (sh.heatingStatus == HeatingStatus.OFF) {
            sh.turnHeatingOn();
        }
        closeAllWindowsAndDoors(sh);
    }

    public void fireAlarm(SmartHome sh){
        System.out.println("Fire! Fire! Opening all windows and doors, turning heating off");
        for (DoorsAndWindows doorsAndWindows : sh.groundFloor.windowsList) {
            doorsAndWindows.open();
        }
        for (DoorsAndWindows doorsAndWindows : sh.upstairs.windowsList) {
            doorsAndWindows.open();
        }
        sh.turnHeatingOff();
    }

}
