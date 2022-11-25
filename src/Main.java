import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     int [] nums = {2,3,4};

     int numconvert = 0;
     for(int num: nums){
       numconvert = 10*numconvert + num;
     }
        System.out.println(numconvert);


    }
    }
