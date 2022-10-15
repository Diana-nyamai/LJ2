package HackerRank;

import java.util.*;

public class Lonelyinteger {
    public static HashSet<Integer> findlonelyinteger(List<Integer> arr){
        Collections.sort(arr);
//        int size  = arr.size();
        HashSet<Integer> unique = new HashSet<>(arr);
        for(int i: arr){
            if(!unique.contains(i)){
                unique.add(i);
            }
        }
        return unique;
    }
    public static void main(String[] args) {
//        finding a lonely integer
        List<Integer> arr = Arrays.asList(1,2,3,4,3,2,1);

        System.out.println(findlonelyinteger(arr));

    }
}
