package practice1;

import java.text.DecimalFormat;

public class ConvertIntegertoString {
    public static void main(String[] args) {
        int x = 123;
//        using integer.toString()
        String y = Integer.toString(123);
//        using String.valueOOf()
        String z = String.valueOf(x);
//        usig decimal format
        DecimalFormat df = new DecimalFormat();
        System.out.println("decimal format " + df.format(x));
//        using string buffer
        StringBuffer sb = new StringBuffer();
        sb.append(x);
        System.out.println("string buffer "+sb.toString());

//        using string builder
        String sbuilder = new StringBuilder().append(x).toString();
        System.out.println("String Builder "+sbuilder);

//        using concatination with empty string
        String a = "" + x;
        System.out.println("using concatination" + a);
        System.out.println("toString " + y);
        System.out.println("valueof " + z);
    }
}
