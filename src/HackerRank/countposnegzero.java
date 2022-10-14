package HackerRank;

public class countposnegzero {
//    all the test cases passed!!
    public static void main(String[] args) {
        int [] vals = {-4, 3, -9, 0, 4, 1};
        float positivevalue = 0f;
        float negativevalue = 0f;
        float zerovalue = 0f;
        int valsize = vals.length;


        for(int i=0; i<valsize; i++){
            if(vals[i] == 0){
                zerovalue++;
            }
            else if(vals[i] > 0){
                positivevalue++;
            }
            else {
                negativevalue++;
            }
        }

        System.out.println("the zero fraction " + String.format("%.6f", zerovalue/valsize));
        System.out.println("the positive fraction " + String.format("%.6f", positivevalue/valsize));
        System.out.println("the negative fraction " + String.format("%.6f", negativevalue/valsize));

    }
}
