import java.util.Random;

public class GenerateData {
    // get a n-length data array
    public static Double[] getRandomData(int N){
        Double[] numbers = getSortedData(N);
        shuffle(numbers);
        return numbers;
    }
    // get a n-length sorted data array
    public static Double[] getSortedData(int N){
        Double[] numbers = new Double[N];
        double t = 0.0;
        for (int i = 0; i < N; i++){
            numbers[i] = t;
            t = t + 1.0/N;
        }
        return numbers;
    }
    // generate n-length array
    public static Double[] getReversedData(int N){
        Double[] numbers = new Double[N];
        double t = 1.0;
        for (int i = 0; i < N; i++){
            t = t - 1.0/N;
            numbers[i] = t;
        }
        return numbers;
    }
    // shuffle at [0, length - 1]
    private static void shuffle(Double[] numbers){
        Random rand = new Random();
        for(int i = 0; i < numbers.length; i++){
            int j = i + rand.nextInt(numbers.length-i);
            exchange(numbers, i, j);
        }
    }
    private static void exchange(Double[] numbers, int i, int j){
        double temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void main(String[] args) {
        Double[] numbers = getRandomData(1000);
        for(int i = 0; i < 100; i++)
            System.out.printf("%5.3f ", numbers[i]);
    }
}
