package fi.lrkr.pathfinder.file;

import fi.lrkr.pathfinder.maze.Maze;
import fi.lrkr.pathfinder.util.List;
import fi.lrkr.pathfinder.vertex.Location;
import java.io.File;
import java.util.Scanner;

/**
 * Class provides functionality for reading and parsing Maze objects from a
 * file.
 */
public class MazeReader {

    private List<Maze> mazes;

    /**
     * Constructor for creating MazeReader object.
     */
    public MazeReader() {
        this.mazes = new List<>();
    }

    /**
     * Reads .txt files containing Maze representations and creates Maze objects
     * from them.
     *
     * @return List of read Maze objects
     */
    public List<Maze> readMazes() {
        File folder = new File(System.getProperty("user.dir") + "/mazes/");
        File[] mazeList = folder.listFiles();
        for (File file : mazeList) {
            if (!file.getName().endsWith(".txt")) {
                continue;
            }
            parseMaze(file);
        }
        return mazes;
    }

    private void parseMaze(File file) {
        try {
            Scanner scanner = new Scanner(file);
            List<String> lines = new List<>();
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
            int w = lines.get(0).length();
            int h = lines.length();
            int[][] mazeArray = new int[h][w];
            for (int y = 0; y < lines.length(); y++) {
                for (int x = 0; x < lines.get(y).length(); x++) {
                    mazeArray[y][x] = lines.get(y).charAt(x) - 48;
                }
            }
            Location start = getStartOrEnd(mazeArray, new Location(-1, -1));
            Location end = getStartOrEnd(mazeArray, start);
            if (start != null && end != null) {
                mazes.add(new Maze(start, end, mazeArray, file.getName()));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Location getStartOrEnd(int[][] mazeArray, Location start) {
        for (int y = 0; y < mazeArray.length; y++) {
            if (mazeArray[y][0] == 0) {
                if (start.getY() == y && start.getX() == 0) {
                    continue;
                }
                return new Location(0, y);
            }
        }
        for (int y = 0; y < mazeArray.length; y++) {
            if (mazeArray[y][mazeArray[0].length - 1] == 0) {
                if (start.getY() == y && start.getX() == mazeArray[0].length - 1) {
                    continue;
                }
                return new Location(mazeArray[0].length - 1, y);
            }
        }
        for (int x = 1; x < mazeArray[0].length - 1; x++) {
            if (mazeArray[0][x] == 0) {
                if (start.getY() == 0 && start.getX() == x) {
                    continue;
                }
                return new Location(x, 0);
            }
        }
        for (int x = 1; x < mazeArray[0].length - 1; x++) {
            if (mazeArray[mazeArray.length - 1][x] == 0) {
                if (start.getY() == mazeArray.length - 1 && start.getX() == x) {
                    continue;
                }
                return new Location(x, mazeArray.length - 1);
            }
        }
        return null;
    }
}
