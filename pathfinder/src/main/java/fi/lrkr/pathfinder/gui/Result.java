package fi.lrkr.pathfinder.gui;

import fi.lrkr.pathfinder.util.Queue;
import java.util.concurrent.TimeUnit;

/**
 * Class provides book keeping for Pathfinder so that the Pathfinder's Steps can
 * be played back and stats can be shown.
 */
public class Result {

    private Queue<Step> steps;
    private Queue<Step> route;
    private int nodes;
    private long setStartTime;
    private long endTime;

    /**
     * Constructor for creating Result object.
     */
    public Result() {
        this.steps = new Queue<>();
        this.route = new Queue<>();
        this.nodes = 0;
    }

    public void setStartTime() {
        this.setStartTime = System.nanoTime();
    }

    public void setEndTime() {
        this.endTime = System.nanoTime();
    }

    private long time() {
        return TimeUnit.NANOSECONDS.toMicros(endTime - setStartTime);
    }

    public void addToStep(Step s) {
        steps.add(s);
    }

    public void addToRoute(Step s) {
        route.add(s);
    }

    public int getLenght() {
        return steps.lenght() + route.lenght();
    }

    /**
     * Method returns the Pathfinder's solve method's steps in sequence.
     *
     * @return Next step in the Pathfinder's solve method
     */
    public Step getNext() {
        if (steps.lenght() != 0) {
            return steps.removeFirst();
        } else if (route.lenght() != 0) {
            return route.removeFirst();
        } else {
            return null;
        }
    }

    public Queue<Step> getRoute() {
        return this.route;
    }

    /**
     * Increments nodes variable which represents amount added to Queue by the
     * Pathfinder.
     */
    public void incrementNodes() {
        nodes++;
    }

    @Override
    public String toString() {
        String r;
        if (route.lenght() == 0) {
            r = "No route found";
        } else {
            r = "Route lenght: " + route.lenght();
        }
        return r + " --- Time (\u00B5s): " + time() + " --- Nodes added to queue: " + nodes;
    }

}
