package leetcode;

public class Maximum69 {
    public static int maximum69Number (int num) {
        String x = String.valueOf(num);
        int y = Integer.parseInt(x.replaceFirst("6","9"));
        return y;
    }
    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
    }
}
