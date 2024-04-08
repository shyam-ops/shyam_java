import java.util.Arrays;
import java.util.List;

public class Prac_10
{
    public static void main(String[] args)  
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
       
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
       
        System.out.println("Sum of numbers: " + sum);
    }
}