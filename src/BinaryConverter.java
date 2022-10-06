import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int x = sc.nextInt();
        System.out.println(Converter.toBinary(x));
    }
}