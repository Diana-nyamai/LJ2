import java.util.ArrayList;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("madza");
        cars.add("prado");
        cars.add("mercedes");
        cars.forEach(i -> {
            System.out.println(i);
        });
    }
}