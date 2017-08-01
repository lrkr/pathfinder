package fi.lrkr.pathfinder;

import java.awt.Color;

public class Step {

    private Location location;
    private Color color;

    public Step(Location location, Color color) {
        this.location = location;
        this.color = color;
    }

    public Location getLocation() {
        return location;
    }

    public Color getColor() {
        return color;
    }

}
