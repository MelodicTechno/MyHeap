public class TripleHeapSort<E extends Comparable<E>> extends HeapSort<E> {
    private final TripleHeap<E> tripleHeap = new TripleHeap<>();
    @Override
    public void sort(E[] dataToBeSorted) {
        for (E e : dataToBeSorted) {
            tripleHeap.insert(e);
        }
        for (int i = 0; i < dataToBeSorted.length; i++) {
            dataToBeSorted[i] = tripleHeap.delete();
        }
    }
    @Override
    public String toString() {
        return "TripleHeapSort";
    }
}
