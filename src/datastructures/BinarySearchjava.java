package datastructures;

import java.util.Arrays;

public class BinarySearchjava {
    public static void main(String[] args) {
        int[] nums = {3,5,7,8,20,22,25,30};
        int first = 0;
        int last = nums.length -1;
        int mid = (first+last)/2;
        int target = 7;

        while(first<=last){
            if(nums[mid] == target){
                System.out.println("index: " + mid);
                break;
            }
            else if (nums[mid] > target) {
                last = mid - 1;
            }
            else{
                first = mid + 1;

            }
            mid= (first+last)/2;
        }
        System.out.println("using binary search method");
        System.out.println(Arrays.binarySearch(nums, target));
    }
}
