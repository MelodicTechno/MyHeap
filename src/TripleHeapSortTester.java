public class TripleHeapSortTester extends HeapSortTester {
    public static void main(String[] args) {
        int[] dataLength = {100, 1000};
        double[] elapsedTime = new double[dataLength.length];
        HeapSort<Double> tripleHeapSort = new TripleHeapSort<>();

        System.out.println("Sort random data:");
        for(int j = 0; j < dataLength.length; j++) {
            elapsedTime[j] = test(tripleHeapSort, GenerateData.getRandomData(dataLength[j]), 5);
        }
        System.out.println("run time");
        for(double time: elapsedTime)
            System.out.printf("%6.4f \n", time);

        System.out.println("Sort sorted data");
        for(int j = 0; j < dataLength.length; j++) {
            elapsedTime[j] = test(tripleHeapSort, GenerateData.getSortedData(dataLength[j]), 5);
        }
        System.out.println("run time");
        for(double time: elapsedTime) {
            System.out.printf("%6.4f \n", time);
        }

        System.out.println("Sort inverse data:");
        for(int j = 0; j < dataLength.length; j++) {
            elapsedTime[j] = test(tripleHeapSort, GenerateData.getReversedData(dataLength[j]), 5);
        }

        System.out.println("run time");
        for(double time: elapsedTime) {
            System.out.printf("%6.4f \n", time);
        }
        System.out.println();
    }
}
