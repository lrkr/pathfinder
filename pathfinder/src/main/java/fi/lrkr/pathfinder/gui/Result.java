package fi.lrkr.pathfinder.gui;

import fi.lrkr.pathfinder.util.Queue;

public class Result {

    private Queue<Step> steps;
    private Queue<Step> route;
    private long setStartTime;
    private long endTime;

    public Result() {
        this.steps = new Queue<>();
        this.route = new Queue<>();
    }

    public void setStartTime(long s) {
        this.setStartTime = s;
    }

    public void setEndTime(long s) {
        this.endTime = s;
    }

    private long time() {
        return this.endTime - this.setStartTime;
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

    @Override
    public String toString() {
        String r;
        if (route.lenght() == 0) {
            r = "No route found";
        } else {
            r = "Route lenght: " + route.lenght();
        }
        return r + " --- Time (ms): " + time();
    }

}
