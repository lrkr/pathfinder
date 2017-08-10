package fi.lrkr.pathfinder.pathfinder;

import fi.lrkr.pathfinder.maze.Maze;
import fi.lrkr.pathfinder.node.Location;
import fi.lrkr.pathfinder.node.Step;
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
        steps.add(new Step(maze.getStart(), Color.blue));
    }

    @Override
    public Queue<Step> solve() {
        while (!queue.isEmpty()) {
            Location current = queue.removeFirst();
            if (checkWin(current)) {
                createPath(current);
                break;
            }
            List<Location> adj = getAdjacent(current);
            for (int i = 0; i < adj.length(); i++) {
                Location location = adj.get(i);
                if (visited[location.getY()][location.getX()] == 0) {
                    steps.add(new Step(location, Color.blue));
                    visited[location.getY()][location.getX()] = 1;
                    location.setPrevious(current);
                    queue.add(location);
                }
            }
        }
        return steps;
    }
}
