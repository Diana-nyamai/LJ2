import java.util.ArrayList;
import java.util.Iterator;

public class Iteration {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("benz");
        cars.add("toyota");
        cars.add("ferrari");
        cars.add("prado");

        Iterator<String> it = cars.iterator();
        while(it.hasNext()){
            String item = it.next();
            if(item.length() <= 5){
                System.out.println(item);
            }

        }

    }
}