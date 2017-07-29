package fi.lrkr.pathfinder;

import java.util.ArrayDeque;
import java.util.List;

public class BreadthFirst extends Pathfinder {

    private ArrayDeque<Location> queue;

    public BreadthFirst(Maze maze) {
        super(maze);
    }

    @Override
    public void solve() {
        this.init();
        while (!queue.isEmpty()) {
            Location current = queue.pop();
            if (checkWin(current)) {
                printPath(current);
                return;
            }
            List<Location> adj = getAdjacent(current);
            for (Location location : adj) {
                if (visited[location.getY()][location.getX()] == 0) {
                    visited[location.getY()][location.getX()] = 1;
                    location.setPrev(current);
                    queue.add(location);
                }
            }
        }
        System.out.println("No path found");
    }

    private void init() {
        this.queue = new ArrayDeque<>();
        this.queue.add(maze.getStart());
        visited[maze.getStart().getY()][maze.getStart().getX()] = 1;
    }

}
