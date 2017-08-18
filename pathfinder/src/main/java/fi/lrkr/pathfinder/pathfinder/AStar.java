package fi.lrkr.pathfinder.pathfinder;

import fi.lrkr.pathfinder.maze.Maze;
import fi.lrkr.pathfinder.vertex.Location;
import fi.lrkr.pathfinder.vertex.Step;
import fi.lrkr.pathfinder.vertex.Node;
import fi.lrkr.pathfinder.util.List;
import fi.lrkr.pathfinder.util.NodeHeap;
import fi.lrkr.pathfinder.util.Queue;
import java.awt.Color;

/**
 * Class implements A* search.
 */
public class AStar extends Pathfinder {

    private NodeHeap heap;
    private List<Location> done;
    private Node[][] nodes;

    /**
     * Constructor for creating AStar search objects.
     *
     * @param maze Maze on which the A* is used on
     */
    public AStar(Maze maze) {
        super(maze);
        this.heap = new NodeHeap();
        this.done = new List<>();
        nodes = new Node[maze.getHeight()][maze.getWidth()];
    }

    @Override
    public Queue<Step> solve() {
        Node start = getNode(maze.getStart());
        start.setLength(0);
        heap.add(start);
        while (!heap.isEmpty()) {
            Node current = heap.poll();
            steps.add(new Step(current.getLocation(), Color.BLUE));
            done.add(current);
            if (checkWin(current.getLocation())) {
                createPath(current);
                break;
            }
            List<Location> adj = getAdjacent(current.getLocation());
            for (int i = 0; i < adj.length(); i++) {
                Node adjNode = getNode(adj.get(i));
                if (!done.contains(adjNode)) {
                    int le = current.getLength() + 1;
                    if (!heap.contains(adjNode) || le < adjNode.getLength()) {
                        adjNode.setPrevious(current);
                        adjNode.setLength(current.getLength() + 1);
                        steps.add(new Step(adjNode.getLocation(), Color.CYAN));
                        heap.add(adjNode);
                    }
                }
            }
        }
        return steps;
    }

    private Node getNode(Location l) {
        Node node = nodes[l.getY()][l.getX()];
        if (node == null) {
            node = new Node(l, l.manhattan(maze.getEnd()));
            nodes[l.getY()][l.getX()] = node;
        }
        return node;
    }
}
