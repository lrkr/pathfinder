package fi.lrkr.pathfinder.util;

import java.util.Arrays;

public class Stack<T> {

    private Object[] stack;
    private int current;
    private int defaultSize = 10;
    private int maxSize = 999999999;

    public Stack() {
        this.current = 0;
        this.stack = new Object[defaultSize];
    }

    public int size() {
        return this.current;
    }

    public boolean isEmpty() {
        return current == 0;
    }

    public void push(Object t) {
        if (current >= stack.length) {
            doubleSize();
        }
        stack[current] = t;
        current++;
    }

    public T pop() {
        Object ret = stack[--current];
        stack[current] = null;
        return (T) ret;
    }

    private void doubleSize() {
        int doubledSize = stack.length * 2;
        if (doubledSize > maxSize) {
            doubledSize = maxSize;
        }
        stack = Arrays.copyOf(stack, doubledSize);
    }
}
