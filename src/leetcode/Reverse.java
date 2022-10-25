package leetcode;

public class Reverse {
    public static int rev(int y ){

          long reverse = 0;
          while(y!=0){
              int rem = y%10;
              reverse = reverse*10 + rem;
              y /=10;
              if(reverse> Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)
                  return 0;

          }
        return (int) reverse;
    }
    public static void main(String[] args) {
        System.out.println(rev(
                1534236469));
    }
}
