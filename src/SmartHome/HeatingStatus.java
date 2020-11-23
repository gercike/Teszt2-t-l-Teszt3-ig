package SmartHome;

public enum HeatingStatus {
    ON("Í"),
    OFF("I");

    public String status;

    HeatingStatus(String status) {
        this.status = status;
    }
}
