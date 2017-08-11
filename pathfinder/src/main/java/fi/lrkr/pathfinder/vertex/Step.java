package fi.lrkr.pathfinder.vertex;

import java.awt.Color;

/**
 * Class provides steps for visualization. It associates a Location with a
 * Color.
 */
public class Step {

    private Location location;
    private Color color;

    /**
     * Constructor for creating Step objects.
     *
     * @param location Location of the step
     * @param color Color of the step
     */
    public Step(Location location, Color color) {
        this.location = location;
        this.color = color;
    }

    /**
     *
     * @return Location of this step
     */
    public Location getLocation() {
        return location;
    }

    /**
     *
     * @return Color of this step
     */
    public Color getColor() {
        return color;
    }

}
