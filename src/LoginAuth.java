import java.util.Scanner;

public class LoginAuth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
         String name = sc.nextLine();
        System.out.println("Enter your password");
        int password = sc.nextInt();
        if(name.length() == 0){
            System.out.println("please enter your name");
        } else if (password == 0) {
            System.out.println("please enter your password");
        }
        else {
            System.out.println("your name is " + name + " and password is " + password);
        }



    }
}