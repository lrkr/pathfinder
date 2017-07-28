package fi.lrkr.pathfinder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

abstract public class Pathfinder {

    protected Maze maze;

    public Pathfinder(Maze maze) {
        this.maze = maze;
    }
    
    abstract public void solve();
    
    protected void printPath(Location l) {
        Stack<Location> path = new Stack<>();
        while (l.getPrev() != null) {
            path.push(l);
            l = l.getPrev();
        }
        path.push(l);
        while(!path.isEmpty()) {
            System.out.println(path.pop());
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
