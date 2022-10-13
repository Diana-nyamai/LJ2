import java.text.DecimalFormat;

public class Doubledecimals {
    public static void main(String[] args) {
        float dec = 1/6f;
        String ff = String.format("%.6f", 1/6f);
        System.out.println(" using string.format  " + ff);

        double deci = 3.5557777;
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println("using decimal format  " + df.format(deci));
    }
}
