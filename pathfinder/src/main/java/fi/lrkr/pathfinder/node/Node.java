package fi.lrkr.pathfinder.node;

import java.util.Objects;

public class Node implements Comparable<Node>, Vertex {

    private Location location;
    private int weight;
    private int length;
    private Node previous;

    public Node(Location location) {
        this.location = location;
    }

    public Node(Location location, int weight) {
        this.location = location;
        this.weight = weight;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Location getLocation() {
        return location;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Node t) {
        return (weight + length) - (t.weight + t.length);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != Node.class) {
            return false;
        }
        Node n = (Node) obj;
        return this.location.equals(n.location);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.location);
        return hash;
    }
}
