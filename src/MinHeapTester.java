import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class MinHeapTester {
    public static void main(String[] args) {
        MinHeap<Integer> minHeap = new MinHeap<>();
        Random integersMaker = new Random();
        Queue<Integer> sortedResult = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int toBeInserted = integersMaker.nextInt(0, 50);
            minHeap.insert(toBeInserted);
        }
        System.out.println(minHeap.peek());
        System.out.println();
        while (!minHeap.isEmpty()) {
            sortedResult.offer(minHeap.delete());
        }
        System.out.println(sortedResult);
        if (minHeap.isEmpty()) {
            System.out.println("the heap is empty");
        }
    }
}
