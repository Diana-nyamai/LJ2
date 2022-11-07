public class CircleArea {
    static Operation op;
    static double pi = 3.14d;
    public static double area(int radius){
      op = new Operation();
        double rsquare = (pi * op.square(radius));
        return rsquare;
    }

}
