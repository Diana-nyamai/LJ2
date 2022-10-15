package HackerRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Lonelyinteger3 {
//    passed all the test cases
    static int lonelyinte(List<Integer> arr){
        int size = arr.size();
        HashSet<Integer> single = new HashSet<>();

        for (int i=0; i<size; i++){
            if(single.contains(arr.get(i))){
                single.remove(arr.get(i));
            }
            else{
                single.add(arr.get(i));
            }
        }
        return single.stream().findFirst().get();
    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,1,2,3);
        System.out.println(lonelyinte(arr));
    }
}
