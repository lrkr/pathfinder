package fi.lrkr.pathfinder.pathfinder.heuristic;

import fi.lrkr.pathfinder.vertex.Location;
import fi.lrkr.pathfinder.vertex.Vertex;

public class ManhattanCross implements Heuristic {

    @Override
    public double calculateHScore(Vertex v1, Vertex v2, Vertex v3) {
        double h;
        Location l1 = v1.getLocation();
        Location l2 = v2.getLocation();
        Location start = v3.getLocation();        
        double dx1 = l1.getX() - l2.getX();
        double dy1 = l1.getY() - l2.getY();
        double dx2 = start.getX() - l2.getX();
        double dy2 = start.getY() - l2.getY();
        double cross = Math.abs(dx1 * dy2 - dx2 * dy1);
        h = Math.abs(dx1) + Math.abs(dy1);
        h += cross * 0.001;
        return h;
    }

}
