package SmartHome;

import java.util.Random;

public class BigWindow extends DoorsWindows {
    public BigWindow() {
        Random r = new Random();
        if (r.nextInt(2) == 0) {
            status = WindowStatus.OPEN;
        } else {
            status = WindowStatus.CLOSED;
        }
    }

    @Override
    public String getStatus() {
        return status.bigWindow;
    }

    @Override
    public void close() {
        this.status = WindowStatus.CLOSED;
    }

    @Override
    public void open() {
        this.status = WindowStatus.OPEN;
    }
}
