/*
 * Question#4
 * to find Maximum & Minimum number using Streams
 */
import java.util.Comparator;
import java.util.stream.Stream;

public class FindMaxAndMinNumbersUsingStreams {
    public static void main(String[] args) {
        Integer maxNumber = Stream.of(6, 8, 3, 5, 1, 9).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max Value is : "+maxNumber);
        Integer minNumber = Stream.of(6, 8, 3, 5, 1, 9).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min Value is :"+minNumber);
    }
}
