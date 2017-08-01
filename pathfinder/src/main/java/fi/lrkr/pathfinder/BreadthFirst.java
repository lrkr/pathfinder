package fi.lrkr.pathfinder;

import java.awt.Color;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class BreadthFirst extends Pathfinder {

    private ArrayDeque<Location> queue;

    public BreadthFirst(Maze maze) {
        super(maze);
        this.queue = new ArrayDeque<>();
        this.queue.add(maze.getStart());
        steps.add(new Step(maze.getStart(), Color.blue));
    }

    @Override
    public Deque<Step> solve() {
        while (!queue.isEmpty()) {
            Location current = queue.pop();
            if (checkWin(current)) {
                createPath(current);
                return steps;
            }
            List<Location> adj = getAdjacent(current);
            for (Location location : adj) {
                if (visited[location.getY()][location.getX()] == 0) {
                    steps.add(new Step(location, Color.blue));
                    visited[location.getY()][location.getX()] = 1;
                    location.setPrev(current);
                    queue.add(location);
                }
            }
        }
        System.out.println("No path found");
        return new ArrayDeque<>();
    }
}
