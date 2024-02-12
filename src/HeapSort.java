public class HeapSort<E extends Comparable<E>> {
    private final MinHeap<E> minHeap = new MinHeap<>();
    // a sort algorithm using my min heap. not that elegant!
    public void sort(E[] dataToBeSorted) {
        for (E e : dataToBeSorted) {
            minHeap.insert(e);
        }
        for (int i = 0; i < dataToBeSorted.length; i++) {
            dataToBeSorted[i] = minHeap.delete();
        }
    }
    // toString
    @Override
    public String toString() {
        return "HeapSort";
    }
}
