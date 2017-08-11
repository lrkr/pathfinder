package fi.lrkr.pathfinder.vertex;

/**
 * Class provides representation of a node in a Maze (or any graph). It has a
 * Location for Maze coordinates, length from the start and heuristic score to
 * the end.
 */
public class Node implements Comparable<Node>, Vertex {

    private Location location;
    private int heuristicScore;
    private int length;
    private Node previous;

    /**
     * Constructor for creating Node objects.
     *
     * @param location Location in the Maze
     * @param heuristicScore Heuristic score to the end
     */
    public Node(Location location, int heuristicScore) {
        this.location = location;
        this.heuristicScore = heuristicScore;
    }

    @Override
    public Node getPrevious() {
        return previous;
    }

    /**
     *
     * @param previous Node
     */
    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    /**
     *
     * @return length from the start
     */
    public int getLength() {
        return length;
    }

    /**
     *
     * @param length from the start
     */
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int compareTo(Node t) {
        return (heuristicScore + length) - (t.heuristicScore + t.length);
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
        hash = 89 * hash + this.location.hashCode();
        return hash;
    }
}
