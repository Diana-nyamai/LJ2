import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      int x = 1243;
      String  xi = "hello";
        System.out.println(" The length of the string is "+ xi.length());
      String a = String.valueOf(x);
      int y;
      for(int i=0; i<String.valueOf(x).length(); i++){
          y = Integer.parseInt(String.valueOf(a.charAt(i)));
          System.out.println(y);
      }

    }
}