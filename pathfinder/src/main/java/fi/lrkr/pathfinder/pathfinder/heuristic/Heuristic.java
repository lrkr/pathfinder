package fi.lrkr.pathfinder.pathfinder.heuristic;

import fi.lrkr.pathfinder.vertex.Vertex;

public interface Heuristic {

    public double calculateHScore(Vertex l1, Vertex l2);
}
