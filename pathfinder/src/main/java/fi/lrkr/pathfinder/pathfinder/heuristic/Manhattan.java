package fi.lrkr.pathfinder.pathfinder.heuristic;

import fi.lrkr.pathfinder.vertex.Location;
import fi.lrkr.pathfinder.vertex.Vertex;

public class Manhattan implements Heuristic {

    @Override
    public double calculateHScore(Vertex v1, Vertex v2, Vertex v3) {
        Location l1 = v1.getLocation();
        Location l2 = v2.getLocation();
        double dx = l1.getX() - l2.getX();
        double dy = l1.getY() - l2.getY();
        return Math.abs(dx) + Math.abs(dy);
    }
}
