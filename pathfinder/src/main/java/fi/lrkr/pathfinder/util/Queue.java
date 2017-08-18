package fi.lrkr.pathfinder.util;

import java.util.Arrays;

public class Queue<T> {

    private int start;
    private int end;
    private Object[] queue;
    private int defaultSize = 10;

    public Queue() {
        this.start = 0;
        this.end = 0;
        this.queue = new Object[defaultSize];
    }

    public boolean isEmpty() {
        return start == end;
    }

    public int lenght() {
        return end - start;
    }

    public void add(Object t) {
        if (end >= queue.length) {
            doubleSize();
        }
        queue[end++] = t;
    }

    public T removeFirst() {
        return (T) queue[start++];
    }

    public T removeLast() {
        return (T) queue[--end];
    }

    private void doubleSize() {
        int doubledSize = queue.length * 2;
        queue = Arrays.copyOf(queue, doubledSize);
    }

}
