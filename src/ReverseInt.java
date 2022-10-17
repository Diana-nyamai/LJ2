public class ReverseInt {
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,5};
        int size = arr.length - 1;

        while(size >= 0){
            System.out.println(arr[size]);
            size--;
        }
    }
}
