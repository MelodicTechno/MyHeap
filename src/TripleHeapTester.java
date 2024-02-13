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
            System.out.println(toBeInserted);
            tripleHeap.insert(toBeInserted);
        }
        System.out.println(tripleHeap.peek());
        System.out.println(tripleHeap.getHeap());
        while (tripleHeap.isEmpty()) {
            int deletedElement = tripleHeap.delete();
            System.out.println(deletedElement);
            sortedResult.offer(deletedElement);
        }
        System.out.println(sortedResult);
    }
}
