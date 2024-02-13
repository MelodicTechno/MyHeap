import java.util.ArrayList;

public class InsertionSort<E extends Comparable<E>> {
    private final ArrayList<E> dataToBeSorted;
    public InsertionSort(ArrayList<E> dataToBeSorted) {
        this.dataToBeSorted = dataToBeSorted;
    }
    public void sort() {
        for (int i = 1; i < dataToBeSorted.size(); i++) {
            for (int j = i; j > 0 && dataToBeSorted.get(j).compareTo(dataToBeSorted.get(j - 1)) < 0; j--) {
                swap(j, j - 1);
            }
        }
    }
    public void swap(int index1, int index2) {
        E elementForStore = dataToBeSorted.get(index1);
        dataToBeSorted.set(index1, dataToBeSorted.get(index2));
        dataToBeSorted.set(index2, elementForStore);
    }
}
