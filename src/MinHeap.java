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

    // insertion method add elements
    public void insert(E element) {

    }
    // heapification from index i
    public void heapify(int i) {
        while (true) {
            int parentIndex = getParentIndex(i);
            if (parentIndex < 0 || heap.get(i).compareTo(heap.get(parentIndex)) >= 0) {
                break;
            }
            swap(i, parentIndex);
            i = parentIndex;
        }
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
