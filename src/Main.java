import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      int x = 1243;
      String a = String.valueOf(x);
      for(int i=0; i<String.valueOf(x).length(); i++){
          int y = Integer.parseInt(String.valueOf(a.charAt(i)));
          System.out.println(y);
      }

    }
}