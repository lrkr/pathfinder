package fi.lrkr.pathfinder.pathfinder;

import fi.lrkr.pathfinder.gui.Result;
import fi.lrkr.pathfinder.maze.Maze;
import fi.lrkr.pathfinder.vertex.Location;
import fi.lrkr.pathfinder.gui.Step;
import fi.lrkr.pathfinder.pathfinder.heuristic.Heuristic;
import fi.lrkr.pathfinder.vertex.Node;
import fi.lrkr.pathfinder.util.List;
import fi.lrkr.pathfinder.util.NodeHeap;
import java.awt.Color;

/**
 * Class implements A* search.
 */
public class AStar extends Pathfinder {

    private NodeHeap heap;
    private Node[][] nodes;
    private Heuristic heuristic;

    /**
     * Constructor for creating AStar search objects.
     *
     * @param maze Maze on which the A* is used on
     * @param heuristic Heuristic which is used
     */
    public AStar(Maze maze, Heuristic heuristic) {
        super(maze);
        this.heap = new NodeHeap();
        this.nodes = new Node[maze.getHeight()][maze.getWidth()];
        this.heuristic = heuristic;
    }

    @Override
    public Result solve() {
        result.setStartTime();
        Node start = getNode(maze.getStart());
        start.setLength(0);
        heap.add(start);
        result.incrementNodes();
        while (!heap.isEmpty()) {
            Node current = heap.poll();
            result.addToStep(new Step(current.getLocation(), Color.BLUE));
            current.setDone(true);
            if (checkWin(current.getLocation())) {
                createPath(current);
                break;
            }
            List<Location> adj = getAdjacent(current.getLocation());
            for (int i = 0; i < adj.length(); i++) {
                Node adjNode = getNode(adj.get(i));
                if (!adjNode.isDone()) {
                    int le = current.getLength() + 1;
                    int contains = heap.contains(adjNode);
                    if (contains == -1) {
                        adjNode.setPrevious(current);
                        adjNode.setLength(le);
                        result.addToStep(new Step(adjNode.getLocation(), Color.CYAN));
                        heap.add(adjNode);
                        result.incrementNodes();
                    } else if (le < adjNode.getLength()) {
                        adjNode.setPrevious(current);
                        adjNode.setLength(le);
                        heap.decKey(contains, le + adjNode.getHeuristic());
                    }
                }
            }
        }
        result.setEndTime();
        return result;
    }

    private Node getNode(Location l) {
        Node node = nodes[l.getY()][l.getX()];
        if (node == null) {
            node = new Node(l, heuristic.calculateHScore(l, maze.getEnd(), maze.getStart()));
            nodes[l.getY()][l.getX()] = node;
        }
        return node;
    }
}
