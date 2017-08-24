package fi.lrkr.pathfinder.pathfinder;

import fi.lrkr.pathfinder.gui.Result;
import fi.lrkr.pathfinder.maze.Maze;
import fi.lrkr.pathfinder.vertex.Location;
import fi.lrkr.pathfinder.gui.Step;
import fi.lrkr.pathfinder.util.List;
import fi.lrkr.pathfinder.util.Queue;
import java.awt.Color;

/**
 * Class implements breath first search.
 */
public class BreadthFirst extends Pathfinder {

    protected int[][] visited;
    private Queue<Location> queue;

    /**
     * Constructor for creating BreathFirst search objects.
     *
     * @param maze Maze on which the BFS is used on
     */
    public BreadthFirst(Maze maze) {
        super(maze);
        this.visited = new int[maze.getHeight()][maze.getWidth()];
        this.queue = new Queue<>();
    }

    @Override
    public Result solve() {
        result.setStartTime();
        queue.add(maze.getStart());
        visited[maze.getStart().getY()][maze.getStart().getX()] = 1;
        result.incrementNodes();
        while (!queue.isEmpty()) {
            Location current = queue.removeFirst();
            result.addToStep(new Step(current, Color.blue));
            if (checkWin(current)) {
                createPath(current);
                break;
            }
            List<Location> adj = getAdjacent(current);
            for (int i = 0; i < adj.length(); i++) {
                Location location = adj.get(i);
                if (visited[location.getY()][location.getX()] == 0) {
                    result.addToStep(new Step(location, Color.cyan));
                    visited[location.getY()][location.getX()] = 1;
                    location.setPrevious(current);
                    queue.add(location);
                    result.incrementNodes();
                }
            }
        }
        result.setEndTime();
        return result;
    }
}
