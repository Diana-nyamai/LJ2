package leetcode;
//solution passed the test
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n == 1 || n%2 == 0){
          return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));
    }
}
