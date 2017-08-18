package fi.lrkr.pathfinder.util;

import fi.lrkr.pathfinder.vertex.Node;
import java.util.Arrays;

/**
 * Class provides functionality for min heap with Node objects.
 *
 */
public class NodeHeap {

    private Node[] heap;
    private int defaultSize = 10;
    private int size;

    public NodeHeap() {
        this.heap = new Node[defaultSize + 1];
        this.size = 0;
    }

    public void add(Node n) {
        size++;
        if (size >= heap.length) {
            doubleSize();
        }
        int i = size;
        while (i > 1 && n.compareTo(heap[parent(i)]) < 0) {
            swap(i, parent(i));
            i = parent(i);
        }
        heap[i] = n;
    }

    public Node poll() {
        Node ret = heap[1];
        heap[1] = heap[size--];
        heapify(1);
        return ret;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Node n) {
        for (int i = 1; i <= size; i++) {
            if (heap[i].equals(n)) {
                return true;
            }
        }
        return false;
    }

    private void heapify(int i) {
        int min;
        int l = left(i);
        int r = right(i);
        if (l <= size && heap[l].compareTo(heap[i]) < 0) {
            min = l;
        } else {
            min = i;
        }
        if (r <= size && heap[r].compareTo(heap[min]) < 0) {
            min = r;
        }
        if (min != i) {
            swap(i, min);
            heapify(min);
        }
    }

    private int parent(int i) {
        return i / 2;
    }

    private int left(int i) {
        return (2 * i);
    }

    private int right(int i) {
        return (2 * i) + 1;
    }

    private void swap(int first, int second) {
        Node temp = heap[first];
        heap[first] = heap[second];
        heap[second] = temp;
    }

    private void doubleSize() {
        int doubledSize = heap.length * 2;
        heap = Arrays.copyOf(heap, doubledSize);
    }
}
