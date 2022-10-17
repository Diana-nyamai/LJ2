package HackerRank;

public class Matrix {
    public static void main(String[] args) {
        int [][] arr = {{3,2,4},{11,2,4},{4,5,6},{10,8,-12}};
        int sumleft =0;
        int sumright = 0;
        for(int i=0; i<arr.length; i++){
            sumleft+= arr[i][i];
            sumright+= arr[i][arr.length-1-i];
        }
        int diff = Math.abs(sumleft - sumright);
        System.out.println(diff);
    }
}
