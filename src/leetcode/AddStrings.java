package leetcode;

public class AddStrings {
    public static String addStrings(String num1, String num2) {
        int numone = Integer.parseInt(num1);
        int numtwo = Integer.parseInt(num2);
        int sum = numone + numtwo;
        return String.valueOf(sum);
    }
    public static void main(String[] args) {
        System.out.println(addStrings("11", "121"));
    }
}
