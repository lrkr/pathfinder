package fi.lrkr.pathfinder;

import java.awt.Color;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

abstract public class Pathfinder {

    protected Maze maze;
    protected int[][] visited;
    protected Deque<Step> steps;

    public Pathfinder(Maze maze) {
        this.steps = new ArrayDeque<>();
        this.maze = maze;
        this.visited = new int[maze.getMaze().length][maze.getMaze()[0].length];
        visited[maze.getStart().getY()][maze.getStart().getX()] = 1;
    }

    abstract public Deque<Step> solve();

    protected void createPath(Location l) {
        Stack<Location> path = new Stack<>();
        while (l != null) {
            path.push(l);
            l = l.getPrev();
        }
        while (!path.isEmpty()) {
            steps.add(new Step(path.pop(), Color.red));
        }
    }

    protected boolean checkWin(Location l1) {
        return maze.getEnd().equals(l1);
    }

    protected List<Location> getAdjacent(Location l) {
        ArrayList<Location> adj = new ArrayList<>();
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
