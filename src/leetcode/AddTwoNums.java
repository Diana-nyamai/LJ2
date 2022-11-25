package leetcode;

import java.util.Arrays;

public class AddTwoNums {
    public static int[] addTwoNumbers(int[] l1, int[] l2) {
//      find the longest array
        int len = Math.min(l1.length, l2.length);
        int[] result = new int[len];

        for(int i=0; i<len; i++){
            result[i] = l1[i]+ l2[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] l1 = {2,4,3};
        int[] l2 = {5,6,4};
        System.out.println(Arrays.toString(addTwoNumbers(l1, l2)));
    }
}
