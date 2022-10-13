package HackerRank;

public class Countposneg {
//    this solution works but not for all test cases
    public static void main(String[] args) {
        int [] vals = {-4, 3, -9, 0, 4, 1};
        float positivevalue = 0f;
        float negativevalue = 0f;
        float zerovalue = 0f;
        int valsize = vals.length;
        String zf1 = "";
        String pf1 ="";
        String nf1 ="";

        for(int i=0; i<valsize; i++){
            if(vals[i] == 0){
                zerovalue++;
                float zf = (zerovalue/valsize);
                zf1 = String.format("%.6f", zf);
            }
            else if(vals[i] > 0){
                positivevalue++;
                float pf = positivevalue/valsize;
                pf1 = String.format("%.6f", pf);
            }
            else {
                negativevalue++;
                float nf = negativevalue/valsize;
                nf1 = String.format("%.6f", nf);
            }
        }

        System.out.println("the zero fraction " + zf1);
        System.out.println("the positive fraction " + pf1);
        System.out.println("the negative fraction " + nf1);


    }
}
