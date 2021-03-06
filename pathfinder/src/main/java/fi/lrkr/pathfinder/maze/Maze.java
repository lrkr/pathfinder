package fi.lrkr.pathfinder.maze;

import fi.lrkr.pathfinder.vertex.Location;

/**
 * Class provides functionality for the maze on which the pathfinding algorithms
 * are used. Maze is represented by 2d int array with 1 being a wall and 0 being
 * open space.
 */
public class Maze {

    private Location start;
    private Location end;
    private int height;
    private int width;
    private int[][] maze;
    private String name;

    /**
     * Constructor for creating Maze objects.
     *
     * @param start Maze's start location
     * @param end Maze's end location
     * @param maze Maze's 2d int array representation
     * @param name Maze's name
     */
    public Maze(Location start, Location end, int[][] maze, String name) {
        this.start = start;
        this.end = end;
        this.maze = maze;
        this.height = maze.length;
        this.width = maze[0].length;
        this.name = name;
    }

    /**
     *
     * @return Height of the maze.
     */
    public int getHeight() {
        return height;
    }

    /**
     *
     * @return Width of the maze.
     */
    public int getWidth() {
        return width;
    }

    /**
     *
     * @return Maze's start location
     */
    public Location getStart() {
        return start;
    }

    /**
     *
     * @return Maze's end location
     */
    public Location getEnd() {
        return end;
    }

    /**
     *
     * @return Maze's 2d array representation
     */
    public int[][] getMaze() {
        return maze;
    }

    @Override
    public String toString() {
        return name;
    }
}
