public class Reverseint2 {
    public static boolean rev(){
        int x = 121;
        int reversed = 0;

        while(x > 0){
            int rem = x%10;
            reversed = reversed*10 + rem;
            x = x/10;
        }
        if(x != reversed){
            return false;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(rev());
    }

}
