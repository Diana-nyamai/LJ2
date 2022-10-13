package HackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Median {
    public static int medianmethod(){
      List<Integer> arr = Arrays.asList(2, 3, 4, 5, 6, 7);
      Collections.sort(arr);
      int size = arr.size();
      if(size%2 == 0){
          return (arr.get(size/2) + arr.get(size/2 - 1))/2;
      }
      else{
          return arr.get(size/2);
      }
    }
    public static void main(String[] args) {
        System.out.println(medianmethod());

        List<Integer> array = Arrays.asList(5, 7, 8, 10, 15, 21);
        Collections.sort(array);
        System.out.println(array);
    }
}
