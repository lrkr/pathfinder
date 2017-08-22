package fi.lrkr.pathfinder.pathfinder.heuristic;

import fi.lrkr.pathfinder.vertex.Location;
import fi.lrkr.pathfinder.vertex.Vertex;

public class ManhattanNudged implements Heuristic {

    @Override
    public double calculateHScore(Vertex v1, Vertex v2, Vertex v3) {
        Location l1 = v1.getLocation();
        Location l2 = v2.getLocation();
        return (Math.abs(l1.getX() - l2.getX()) + Math.abs(l1.getY() - l2.getY()) * 1.001);
    }
}
