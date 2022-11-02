public class CircleArea {

    static double pi = 3.14d;
    public static double area(int radius){
        Operation op = new Operation();
        double rsquare = (pi * op.square(radius));
        return rsquare;
    }

}
