import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class TripleHeapTester {
    public static void main(String[] args) {
        TripleHeap<Integer> tripleHeap = new TripleHeap<>();
        Random integersMaker = new Random();
        Queue<Integer> sortedResult = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int toBeInserted = integersMaker.nextInt(0, 50);
            tripleHeap.insert(toBeInserted);
        }
        System.out.println(tripleHeap.peek());
        while (!tripleHeap.isEmpty()) {
            int deletedElement = tripleHeap.delete();
            sortedResult.offer(deletedElement);
        }
        System.out.println(sortedResult);
    }
}
