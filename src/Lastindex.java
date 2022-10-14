import java.util.Arrays;
import java.util.List;

public class Lastindex {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2,3,4,5,6,7);
        int firstindex = 0;
        int lastindex = arr.size() - 1;
        System.out.println("The last index is " + arr.get(lastindex));
        System.out.println("The first index is "+ arr.get(firstindex));
    }
}
