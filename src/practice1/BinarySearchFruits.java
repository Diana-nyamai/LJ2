package practice1;

public class BinarySearchFruits {
    public static void main(String[] args) {
        String[] fruits = {"mango", "banana", "orange", "guava", "watermelon"};
        int start = 0;
        int last = fruits.length-1;
        int mid =(start+last)/2;
        String target = "banana";

        while(start<=last){
            if(fruits[mid] == target ){
                System.out.println("index is: " + mid);//expected index 2
                break;
            }
            else {
                System.out.println("the fruit is not at the middle");
                break;
            }
//            mid =(start+last)/2;
        }
    }
}
