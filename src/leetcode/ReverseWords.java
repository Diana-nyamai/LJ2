package leetcode;

import java.util.Arrays;

public class ReverseWords {
    public static String reverseWords(String s) {
       String trim = s.trim();
       String[] splitw = trim.split("\\s+");
       int first = 0;
       int last = splitw.length - 1;

       while (first<last){
           String temp = splitw[first];
           splitw[first] = splitw[last];
           splitw[last] = temp;
           first++;
           last--;
       }
       return String.join(" ", splitw);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));


    }
}
