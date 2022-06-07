/*
 * Question#1
 * to find duplicate elements in the above list
 *  using java 8 streams. 
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesUsingStreams {

    public static Set<Integer> getDuplicateNumbers(List<Integer> listOfNumbers) {
        Set<Integer> numberItems = new HashSet<>();
        return listOfNumbers.stream()
                .filter(n -> !numberItems.add(n)) 
                .collect(Collectors.toSet());
    }
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        Set<Integer> result = getDuplicateNumbers(list);
        System.out.println(result);   
    }  
}
