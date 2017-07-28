package fi.lrkr.pathfinder;

public class Location {

    private int x;
    private int y;
    private Location prev;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
        this.prev = null;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void setPrev(Location l) {
        this.prev = l;
    }
    
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
