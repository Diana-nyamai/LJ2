public class Converter {
    public static int toBinary(int num){
       String binary = "";
       while(num > 0){
           binary = (num%2) + binary;
           num/=2;
       }
       return Integer.parseInt(binary);
    }
}