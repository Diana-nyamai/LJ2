package practice1;

public class ReverseString {
    public static void main(String[] args) {
        String s = "DIANA";
        int end = s.length() - 1;
        StringBuilder str = new StringBuilder();
        for(int i=end; i>=0; i--){
            char y = s.charAt(i);
            str.append(y);
        }
        System.out.println(str);
    }
}
