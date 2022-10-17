//my solution to reverse a string

public class ReverseString2 {
    public static void main(String[] args) {
        String greeting = "hello";
        int size = greeting.length() - 1;
        while(size >= 0){
            System.out.println(greeting.charAt(size));
            size--;
        }
        System.out.println();
    }
}
