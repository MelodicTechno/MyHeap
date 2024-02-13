import java.util.ArrayList;

public class TripleHeap<E extends Comparable<E>> extends MinHeap<E> {
    // using an array to implement triple tree
    private final ArrayList<E> heap;
    // constructor
    public TripleHeap() {
        this.heap = new ArrayList<>();
    }

    @Override
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

    @Override
    public int getLeftIndex(int index) {
        return 3 * index + 1;
    }

    public int getMidIndex(int index) {
        return 3 * index + 2;
    }

    @Override
    public int getRightIndex(int index) {
        return 3 * index + 3;
    }

    @Override
    public int getParentIndex(int index) {
        return (index - 1) / 3;
    }
}
