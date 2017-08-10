package fi.lrkr.pathfinder.pathfinder;

import fi.lrkr.pathfinder.maze.Maze;
import fi.lrkr.pathfinder.node.Location;
import fi.lrkr.pathfinder.node.Step;
import fi.lrkr.pathfinder.node.Node;
import fi.lrkr.pathfinder.util.List;
import fi.lrkr.pathfinder.util.Queue;
import java.awt.Color;
import java.util.PriorityQueue;

/**
 * Class implements A* search.
 */
public class AStar extends Pathfinder {

    private PriorityQueue<Node> queue;
    private List<Location> done;
    private Node[][] nodes;

    /**
     * Constructor for creating AStar search objects.
     *
     * @param maze Maze on which the A* is used on
     */
    public AStar(Maze maze) {
        super(maze);
        this.queue = new PriorityQueue<>();
        this.done = new List<>();
        nodes = new Node[maze.getHeight()][maze.getWidth()];
    }

    @Override
    public Queue<Step> solve() {
        Node start = getNode(maze.getStart());
        start.setLength(0);
        queue.add(start);
        steps.add(new Step(start.getLocation(), Color.BLUE));
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (checkWin(current.getLocation())) {
                createPath(current);
                break;
            }
            List<Location> adj = getAdjacent(current.getLocation());
            done.add(current);
            for (int i = 0; i < adj.length(); i++) {
                Node adjNode = getNode(adj.get(i));
                if (!done.contains(adjNode)) {
                    int le = current.getLength() + 1;
                    if (!queue.contains(adjNode) || le < adjNode.getLength()) {
                        adjNode.setPrevious(current);
                        adjNode.setLength(current.getLength() + 1);
                        steps.add(new Step(adjNode.getLocation(), Color.BLUE));
                        queue.add(adjNode);
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
