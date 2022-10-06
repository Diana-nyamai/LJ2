import java.util.ArrayList;
import java.util.function.Consumer;


public class LambdaConsumer {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("madza");
        cars.add("prado");
        cars.add("mercedes");
        Consumer<String> method = (i) ->{
            System.out.println(i);
        };
        cars.forEach(method);
    }
}