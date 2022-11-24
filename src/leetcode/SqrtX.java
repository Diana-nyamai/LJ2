package leetcode;

public class SqrtX {
    public static int mySqrt(int x) {
        int temp = 1;
       while(x!=0){
           if(x%2 == 0){
                x= x/2;
                temp = temp*2;
           }
           x=x/2;
       }
       return temp;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
}
