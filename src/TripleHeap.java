import java.util.ArrayList;

public class TripleHeap<E extends Comparable<E>> extends MinHeap<E> {
    // using an array to implement triple tree
    private final ArrayList<E> heap;
    // constructor
    public TripleHeap() {
        this.heap = new ArrayList<>();
    }
    // get the top
    public E peek() {
        return heap.get(0);
    }

    // check if the heap is empty
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    // insert new element to the foot of the heap
    public void insert() {

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
    public int getLeftIndex(int index) {
        return 3 * index + 1;
    }
    public int getMidIndex(int index) {
        return 3 * index + 2;
    }
    public int getRightIndex(int index) {
        return 3 * index + 3;
    }
    public int getParentIndex(int index) {
        return (index - 1) / 3;
    }

    // swap two nodes
    public void swap(int index1, int index2) {
        E NodeForStore = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, NodeForStore);
    }
}
