import java.util.ArrayList;

public class MinHeap<E extends Comparable<E>> {
    // it is actually a complete binary tree, described with ArrayList
    private final ArrayList<E> heap;
    // constructor
    public MinHeap () {
        heap = new ArrayList<>();
    }

    // get the top of the heap
    public E peek() {
        return heap.get(0);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }
    // insertion method add elements
    public void insert(E element) {
        heap.add(element);
        upHeapify(heap.size() - 1);
    }
    // heapification from index i
    public void upHeapify(int i) {
        while (true) {
            int parentIndex = getParentIndex(i);
            if (parentIndex < 0 || heap.get(i).compareTo(heap.get(parentIndex)) >= 0) {
                break;
            }
            swap(i, parentIndex);
            i = parentIndex;
        }
    }
    // heapify downwards
    public void downHeapify(int i) {
        while (true) {
            int leftIndex = getLeftIndex(i);
            int rightIndex = getRightIndex(i);
            int minIndex = i;
            if (leftIndex < heap.size() && heap.get(leftIndex).compareTo(heap.get(minIndex)) < 0) {
                minIndex = leftIndex;
            }
            if (rightIndex < heap.size() && heap.get(rightIndex).compareTo(heap.get(minIndex)) < 0) {
                minIndex = rightIndex;
            }
            if (minIndex == i) {
                break;
            }
            swap(i, minIndex);
            i = minIndex;
        }
    }
    // deletion of heap
    public E delete() {
        // if empty
        if (this.heap.isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        swap(0, this.heap.size() - 1);
        E removedElement = heap.remove(heap.size() - 1);
        downHeapify(0);
        return removedElement;
    }
    // get the index
    public int getLeftIndex(int i) {
        return 2 * i + 1;
    }
    public int getRightIndex(int i) {
        return 2 * i + 2;
    }
    public int getParentIndex(int i) {
        return (i - 1) / 2;
    }

    // swap two nodes
    public void swap(int index1, int index2) {
        E NodeForStore = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, NodeForStore);
    }
}
