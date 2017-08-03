package fi.lrkr.pathfinder;

/**
 * Class provides a representation of location in coordinate space with x, y
 * coordinates.
 */
public class Location {

    private int x;
    private int y;
    private Location prev;

    /**
     * Constructor for creating Location object with x and y coordinates
     *
     * @param x Location's x coordinate
     * @param y Location's y coordinate
     */
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
        this.prev = null;
    }

    /**
     *
     * @return x coordinate
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @return y coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Sets a previous location for this location creating a kind of linked
     * list. Used for backtracking from end after pathfinding is done to get the
     * actual route. This probably should be done in its own class but it's
     * simpler this way as you there is no need to juggle two different objects
     * with the algorithms..
     *
     * @param l
     */
    public void setPrev(Location l) {
        this.prev = l;
    }

    /**
     *
     * @return Previous location before this one. As in from which location it
     * is the shortest path to this one.
     */
    public Location getPrev() {
        return this.prev;
    }

    @Override
    public String toString() {
        return "x: " + this.x + "      y: " + this.y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != Location.class) {
            return false;
        }
        Location l2 = (Location) obj;
        return this.y == l2.y && this.x == l2.x;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.x;
        hash = 71 * hash + this.y;
        return hash;
    }
}
