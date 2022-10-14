package HackerRank;

import java.util.*;

public class Lonelyinteger {
    public static HashSet<Integer> findlonelyinteger(List<Integer> arr){
        Collections.sort(arr);
        int size  = arr.size();
        HashSet<Integer> withdupes = new HashSet<>();
        for(int i=0; i<size; i++){
          if(!withdupes.contains(arr.get(i))){
              withdupes.add(arr.get(i));
          }
        }
        return withdupes;
    }
    public static void main(String[] args) {
//        finding a lonely integer
        List<Integer> arr = Arrays.asList(1,2,3,4,3,2,1);

        System.out.println(findlonelyinteger(arr));

    }
}
