/*
 * Question#2
 * to find duplicate elements in the above list
 * without using set. 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class FindDuplicatesWithoutUsingSet {
    public static void main(String[] args) 
    {
        // ArrayList with duplicate elements
        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(4,5,7,8,99,100,101,33,32,4,4));
        List<Integer> listWithoutDuplicates = listOfNumbers.stream().distinct().collect(Collectors.toList());
        System.out.println(listWithoutDuplicates);
    } 
}
