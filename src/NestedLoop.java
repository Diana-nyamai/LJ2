public class NestedLoop {
    public static void main(String[] args) {
        int [][]arr = {
                {2,3,5},
                {7,4,2},
                {9,5,3}
        };
       for(int [] i: arr){
           for (int j: i){
               System.out.println(j + "\t");
           }
           System.out.println("");
       }
    }
}
