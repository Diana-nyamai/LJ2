public class Overloading {
    static int multiply(int x, int y){
      return x * y;
    }
    static double multiply(double x, double y){
        return x * y;
    }
    public static void main(String[] args) {
       int integers = multiply(+ 3,5);
       double doubles = multiply(4.4, 6.6);
        System.out.println("multiply integers " + integers);
        System.out.println("multiply doubles " + doubles);
    }
}