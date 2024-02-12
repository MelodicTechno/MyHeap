import java.util.Arrays;

public class HeapSortTester {
    // calculate the time consumed
    public static double time(HeapSort<Double> alg, Double[] numbers){
        double start = System.nanoTime();
        alg.sort(numbers);
        double end = System.nanoTime();
        return Math.log(end - start);
    }
    public static double test(HeapSort<Double> alg, Double[] numbers, int T) {
        Double[] cpy = Arrays.copyOf(numbers, numbers.length);
        double totalTime = 0;
        for(int i = 0; i < T; i++)
            totalTime += time(alg, cpy);
        return totalTime/T;
    }
    public static void main(String[] args) {
        int[] dataLength = {100, 1000};
        double[] elapsedTime = new double[dataLength.length];
        HeapSort<Double> heapSort = new HeapSort<>();
        System.out.println("Sort random data:");
        for(int j = 0; j < dataLength.length; j++) {
            elapsedTime[j] = test(heapSort, GenerateData.getRandomData(dataLength[j]), 5);
        }
        System.out.println("run time");
        for(double time: elapsedTime)
            System.out.printf("%6.4f \n", time);
        System.out.println("Sort sorted data");
        for(int j = 0; j < dataLength.length; j++) {

            elapsedTime[j] = test(heapSort, GenerateData.getSortedData(dataLength[j]), 5);
        }
        System.out.println("run time");
        for(double time: elapsedTime) {
            System.out.printf("%6.4f \n", time);
        }
        System.out.println("Sort inverse data:");
        for(int j = 0; j < dataLength.length; j++) {
            elapsedTime[j] = test(heapSort, GenerateData.getReversedData(dataLength[j]), 5);
        }
        System.out.println("run time");
        for(double time: elapsedTime) {
            System.out.printf("%6.4f \n", time);
        }
        System.out.println();
    }
}
