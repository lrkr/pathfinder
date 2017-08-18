package fi.lrkr.pathfinder.util;

import java.util.Arrays;

public class List<T> {

    private Object[] list;
    private int current;
    private int defaultSize = 10;

    public List() {
        this.current = 0;
        this.list = new Object[defaultSize];
    }

    public int length() {
        return this.current;
    }

    public void add(Object t) {
        if (current >= list.length) {
            doubleSize();
        }
        list[current++] = t;
    }

    private void doubleSize() {
        int doubledSize = list.length * 2;
        list = Arrays.copyOf(list, doubledSize);
    }

    public T get(int index) {
        if (index < 0 || index >= current) {
            throw new IndexOutOfBoundsException();
        }
        return (T) list[index];
    }

    public boolean contains(Object t) {
        for (int i = 0; i < current; i++) {
            if (list[i].equals(t)) {
                return true;
            }
        }
        return false;
    }

}
