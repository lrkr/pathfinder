package fi.lrkr.pathfinder.pathfinder;

import fi.lrkr.pathfinder.maze.Maze;
import fi.lrkr.pathfinder.vertex.Location;
import fi.lrkr.pathfinder.vertex.Step;
import fi.lrkr.pathfinder.util.List;
import fi.lrkr.pathfinder.util.Queue;
import java.awt.Color;

/**
 * Class implements breath first search.
 */
public class BreadthFirst extends Pathfinder {

    private Queue<Location> queue;

    /**
     * Constructor for creating BreathFirst search objects.
     *
     * @param maze Maze on which the BFS is used on
     */
    public BreadthFirst(Maze maze) {
        super(maze);
        this.queue = new Queue<>();
        this.queue.add(maze.getStart());
    }

    @Override
    public Queue<Step> solve() {
        while (!queue.isEmpty()) {
            Location current = queue.removeFirst();
            steps.add(new Step(current, Color.blue));
            if (checkWin(current)) {
                createPath(current);
                break;
            }
            List<Location> adj = getAdjacent(current);
            for (int i = 0; i < adj.length(); i++) {
                Location location = adj.get(i);
                if (visited[location.getY()][location.getX()] == 0) {
                    steps.add(new Step(location, Color.cyan));
                    visited[location.getY()][location.getX()] = 1;
                    location.setPrevious(current);
                    queue.add(location);
                }
            }
        }
        return steps;
    }
}
