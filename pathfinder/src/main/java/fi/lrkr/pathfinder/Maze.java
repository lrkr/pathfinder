package fi.lrkr.pathfinder;

public class Maze {

    private Location start;
    private Location end;
    private int[][] maze;

    public Maze(Location start, Location end, int[][] maze) {
        this.start = start;
        this.end = end;
        this.maze = maze;
    }

    public Maze() {
        this.start = new Location(4, 0);
        this.end = new Location(4, 4);
        this.maze = new int[][]{
            {1, 1, 1, 1, 0, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 1, 1, 1, 1, 1, 0, 1},
            {1, 0, 0, 1, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 0, 1, 1, 1, 1, 1}
        };
    }

    public Location getStart() {
        return start;
    }

    public Location getEnd() {
        return end;
    }

    public int[][] getMaze() {
        return maze;
    }

}
