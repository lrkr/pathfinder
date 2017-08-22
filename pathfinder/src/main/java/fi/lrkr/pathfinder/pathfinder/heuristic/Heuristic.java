package fi.lrkr.pathfinder.pathfinder.heuristic;

import fi.lrkr.pathfinder.vertex.Vertex;

public interface Heuristic {

    public double calculateHScore(Vertex v1, Vertex v2, Vertex v3);
}
