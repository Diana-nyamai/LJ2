import java.util.HashSet;

public class HashedSet {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);

        for(int i=1; i<=10; i++){
            if(numbers.contains(i)){
                System.out.println("The number is present " + i);
            }
            else {
                System.out.println("The number is absent" + i);
            }
        }

    }
}