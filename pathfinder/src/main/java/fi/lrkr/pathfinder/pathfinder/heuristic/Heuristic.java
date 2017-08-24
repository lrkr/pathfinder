package fi.lrkr.pathfinder.pathfinder.heuristic;

import fi.lrkr.pathfinder.vertex.Vertex;

/**
 * Interface for different Heuristic implementations.
 */
public interface Heuristic {

    /**
     * Calculates the Heuristic score between Current and End vertex. Some
     * Heuristics will also use Start Vertex.
     *
     * @param v1 Current Vertex
     * @param v2 End Vertex
     * @param v3 Start Vertex
     * @return
     */
    public double calculateHScore(Vertex v1, Vertex v2, Vertex v3);
}
