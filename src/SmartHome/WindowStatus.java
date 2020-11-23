package SmartHome;

public enum WindowStatus {
    OPEN("\u25A1", "\u25AF", "\u25AD"),
    CLOSED("\u25A0", "\u25AE", "\u25AC");

    public String smallWindow;
    public String door;
    public String bigWindow;

    WindowStatus(String smallWindow, String door, String bigWindow) {
        this.door = door;
        this.smallWindow = smallWindow;
        this.bigWindow = bigWindow;
    }
}
