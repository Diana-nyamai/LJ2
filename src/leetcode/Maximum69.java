package leetcode;

public class Maximum69 {
    public static int maximum69Number (int num) {
       int size = String.valueOf(num).length();

       for(int i=0; i<size; i++){
           System.out.println(i);
       }
       return num;
    }
    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
    }
}
