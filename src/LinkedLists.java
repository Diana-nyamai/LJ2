import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("mercedes");
        cars.addFirst("prado");
        for (String i : cars){
            System.out.println(i);
        }
    }
}