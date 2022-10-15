package HackerRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Lonelyinteger2 {
    static HashSet<Integer> lonelyint(List<Integer> arr){
        int size = arr.size();
        HashSet<Integer> unique = new HashSet<>(arr);
        for(int i : unique){
            if(arr.stream().filter(x -> !x.equals(i)).count() == size -1){
                System.out.println(i);
            }
        }
        return unique;
    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,1,2,3);
//        System.out.println(lonelyint(arr));
        lonelyint(arr);
    }
}
