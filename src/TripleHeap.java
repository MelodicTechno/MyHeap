import java.util.ArrayList;

public class TripleHeap<E extends Comparable<E>> extends MinHeap<E> {
    // using an array to implement triple tree
    private final ArrayList<E> heap;
    // constructor
    public TripleHeap() {
        this.heap = new ArrayList<>();
    }

    // get the top of the heap
    public E peek() {
        return heap.get(0);
    }
    public boolean isEmpty() {
        return heap.isEmpty();
    }
    public void insert(E element) {
        heap.add(element);
        upHeapify(heap.size() - 1);
    }

    // heapification from index i
    // it is different from binary tree
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
            int midIndex = getMidIndex(i);
            int rightIndex = getRightIndex(i);
            int minIndex = i;
            if (leftIndex < heap.size() && heap.get(leftIndex).compareTo(heap.get(minIndex)) < 0) {
                minIndex = leftIndex;
            }
            if (midIndex < heap.size() && heap.get(minIndex).compareTo(heap.get(midIndex)) < 0) {
                minIndex = midIndex;
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
        if (heap.isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        swap(0, heap.size() - 1);
        E removedElement = heap.remove(heap.size() - 1);
        downHeapify(0);
        return removedElement;
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
