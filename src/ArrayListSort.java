import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(33);
        nums.add(55);
        nums.add(12);
        nums.add(1);
        nums.add(9);

//        sorting the array in ascending order
        Collections.sort(nums);
        for (int i: nums) {
            System.out.println(i);
        }
    }
}