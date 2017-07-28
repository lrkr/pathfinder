package fi.lrkr.pathfinder;

public class Main {

    public static void main(String[] args) {
        Maze maze = new Maze();
        BreadthFirst bfs = new BreadthFirst(maze);
        bfs.solve();
    }
}
