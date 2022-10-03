public class Recursionjav {
    public static int Summation(int x){
        if(x>0){
            return x + Summation(x-1);
        }
        else {
            return 0;
        }

    }
    public static void main(String[] args) {
        int res = Summation(5);
        System.out.println(res);
    }
}
//this will print out the return the sum of numbers between one and ten