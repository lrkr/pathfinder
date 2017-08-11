package fi.lrkr.pathfinder.pathfinder;

import fi.lrkr.pathfinder.maze.Maze;
import fi.lrkr.pathfinder.vertex.Location;
import fi.lrkr.pathfinder.vertex.Vertex;
import fi.lrkr.pathfinder.vertex.Step;
import fi.lrkr.pathfinder.util.List;
import fi.lrkr.pathfinder.util.Queue;
import fi.lrkr.pathfinder.util.Stack;
import java.awt.Color;

/**
 * Abstract class for Pathfinding algorithms. Provides useful methods that are
 * needed for different Pathfinder implementations.
 */
abstract public class Pathfinder {

    protected Maze maze;
    protected int[][] visited;
    protected Queue<Step> steps;

    /**
     * Constructor for creating Pathfinder objects.
     *
     * @param maze Maze on which the Pathfinder is used
     */
    public Pathfinder(Maze maze) {
        this.steps = new Queue<>();
        this.maze = maze;
        this.visited = new int[maze.getHeight()][maze.getWidth()];
        visited[maze.getStart().getY()][maze.getStart().getX()] = 1;
    }

    /**
     * Abstract method for solving the Maze. Each implementation uses its own
     * solve method.
     *
     * @return Queue of Step objects used for visualization
     */
    abstract public Queue<Step> solve();

    /**
     * After Pathfinder has reached the end this method backtracks to the start
     * to create the route.
     *
     * @param l Pathfinder's last Vertex which is the Maze's end Location if
     * Pathfinder was successful.
     */
    protected void createPath(Vertex l) {
        Stack<Vertex> path = new Stack<>();
        while (l != null) {
            path.push(l);
            l = l.getPrevious();
        }
        while (!path.isEmpty()) {
            steps.add(new Step(path.pop().getLocation(), Color.red));
        }
    }

    /**
     * Checks if the current location is the Maze's end location.
     *
     * @param l Location to be checked
     * @return Boolean value signifying if the pathfinder is at the end or not
     */
    protected boolean checkWin(Location l) {
        return maze.getEnd().equals(l);
    }

    /**
     * Creates a list of valid Locations adjacent to a Location.
     *
     * @param l Location from which adjacents are checked
     * @return List of valid adjacent Locations
     */
    protected List<Location> getAdjacent(Location l) {
        List<Location> adj = new List<>();
        Location up = new Location(l.getX(), l.getY() - 1);
        Location down = new Location(l.getX(), l.getY() + 1);
        Location left = new Location(l.getX() - 1, l.getY());
        Location right = new Location(l.getX() + 1, l.getY());
        if (isValid(up)) {
            adj.add(up);
        }
        if (isValid(down)) {
            adj.add(down);
        }
        if (isValid(left)) {
            adj.add(left);
        }
        if (isValid(right)) {
            adj.add(right);
        }
        return adj;
    }

    /**
     * Checks the validity of a location. Location needs to be within the Maze
     * and the value at the Location must be 0.
     *
     * @param l Location to be checked
     * @return Boolean value for Locations validity
     */
    private boolean isValid(Location l) {
        int x = l.getX();
        int y = l.getY();
        if (x < 0 || y < 0 || x >= maze.getMaze()[0].length || y >= maze.getMaze().length) {
            return false;
        }
        if (maze.getMaze()[y][x] != 0) {
            return false;
        }
        return true;
    }
}
