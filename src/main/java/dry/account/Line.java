package dry.account;

import java.awt.*;

public class Line {
    private Point start;
    private Point end;

    public double length() {
        return start.distance(end);
    }
}
