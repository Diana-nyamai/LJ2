public class Reverseint2 {
    public static boolean rev(int y){
        int x = y;
        int reversed = 0;

        while(x > 0){
            int rem = x%10;
            reversed = reversed*10 + rem;
            x = x/10;
        }
        return reversed == y;
    }
    public static void main(String[] args) {
        System.out.println(rev(-121));
    }

}
