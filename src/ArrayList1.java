import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("mercedes");
      cars.add("axios");
      cars.add("Ferrari");
      cars.add("Prado");
      cars.set(3, "tx");

      String acc = cars.get(2);
        System.out.println(acc);
        System.out.println(cars);
//        System.out.println(change);
    }
}