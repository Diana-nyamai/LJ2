import java.util.ArrayList;

public class Arr {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("mercedes");
        cars.add("axios");
        cars.add("ferrari");
        cars.add("prado");
//        this method removes all the elements in an array list
//        cars.clear();

//the for loop will loop through the array list
        for (String i : cars) {
            System.out.println(i);
        }
    }
}