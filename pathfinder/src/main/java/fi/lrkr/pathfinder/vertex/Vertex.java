package fi.lrkr.pathfinder.vertex;

/**
 * This is an interface for using different kinds of Vertex (or node, or point)
 * objects in the same kinds of methods. Mostly used in the method for
 * backtracking the route after Pathfinder has finished.
 */
public interface Vertex {

    /**
     * @return Previous Vertex before this one. Meaning which Vertex it is the
     * shortest path to this one.
     */
    public Vertex getPrevious();

    /**
     *
     * @return Location which this vertex is associated to
     */
    public Location getLocation();
}
