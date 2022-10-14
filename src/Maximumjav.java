import java.util.Arrays;
import java.util.List;

public class Maximumjav {
    public static int maximum(List<Integer> numbers){
        int max = numbers.get(0);

        for(int i : numbers){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(20,3,40,5,6,7);
        int n = maximum(numbers);
        System.out.println(n);
    }
}
