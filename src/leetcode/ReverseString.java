package leetcode;

import java.util.Arrays;

public class ReverseString {
    public static void revstring(char [] s){
        int start = 0;
        int end = s.length -1;

        while(start <= end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        char [] arr = {'H','e','l','l','o','7'};
        revstring(arr);
    }
}
