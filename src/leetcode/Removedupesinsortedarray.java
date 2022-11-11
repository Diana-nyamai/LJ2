package leetcode;

public class Removedupesinsortedarray {
    public static int removeDuplicates(int[] nums) {
       int ptr = 1;
       for(int i=0; i< nums.length - 1; i++){
           if(nums[i] == nums[i+1]){
              continue;
           }
           else{
               nums[ptr] = nums[i+1];
               ptr++;
           }
       }
       return ptr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3};
        System.out.println(removeDuplicates(arr));
    }
}
