import java.util.Arrays;

public class Swapp {
    public static void main(String[] args) {
       String[] s = {"hello", "diana"};
       int size = s.length -1;
       int start = 0;
       while (start <= size){
           String temp = s[0];
           s[0] = s[size];
           s[size] = temp;
           start++;
           size--;

       }
        System.out.println(Arrays.toString(s));
    }
}
