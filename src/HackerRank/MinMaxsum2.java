package HackerRank;

public class MinMaxsum2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        long min = 0l, max=0l;
        int middle = arr.length - 1;

        for(int i=0; i<middle; i++){
            min+=arr[i];
        }
        for(int i=middle; i>0; i--){
            max+=arr[i];
        }

        System.out.println("min " + min + " max " + max);
    }
}
