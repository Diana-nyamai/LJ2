//my solution to reverse a string

public class ReverseString2 {
    public static void main(String[] args) {
        String greeting = "refer";
        int size = greeting.length() - 1;
        String rev = "";
        while(size >= 0){
            rev = rev + greeting.charAt(size);
            size--;
        }
        if(rev.equals(greeting)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
//        System.out.println(rev);
    }
}
