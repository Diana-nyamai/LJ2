package HackerRank;

public class MinmaxSum {
//    not all test cases passed
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int sum = 0;
        int sum2 = 0;
        int middle = arr.length - 1;
        int size = arr.length;

        for(int i=0; i<middle; i++){
            sum+=arr[i];
          }
        for(int i=1; i<size; i++){
            sum2+=arr[i];
        }
        System.out.println(sum);
        System.out.println(sum2);
        }
    }

