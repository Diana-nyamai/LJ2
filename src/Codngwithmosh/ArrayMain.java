package Codngwithmosh;

public class ArrayMain {
    public static void main(String[] args) {
      Arrayexercise arr = new Arrayexercise(3);
      arr.insert(20);
      arr.insert(30);
      arr.insert(40);
      arr.insert(50);
      arr.removeAt(3);
        System.out.println("the index is " + arr.IndexOf(50));
      arr.print();
    }
}
