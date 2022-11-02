package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Fizzbuzz {
    public static List<String> fizzbuzz(int n){
        List<String> l = new ArrayList<>();
       for(int i=1; i<=n; i++){
           if(i%3 == 0 && i%5 == 0){
               l.add("FizzBuzz");
           } else if (i%3 == 0) {
               l.add("Fizz");
           } else if (i%5 == 0) {
               l.add("Buzz");
           }
           else {
               l.add(String.valueOf(i));
           }
       }
        return l;
    }
    public static void main(String[] args) {
        System.out.println(fizzbuzz(15));
    }
}
