package practice1;

public class ReverseString {
    public static void main(String[] args) {
        String s = "DIANA";
        int end = s.length() - 1;
        for(int i=end; i>=0; i--){
            System.out.println(s.charAt(i));
        }
    }
}
