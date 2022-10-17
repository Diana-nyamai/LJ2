public class Reversestring {
//    solution on internet
    public static void Rev(String name){
        String rs = "";
        for(int i=0; i<name.length(); i++){
            rs = name.charAt(i) + rs;

        }
        System.out.println(rs);
    }
    public static void main(String[] args) {
     Rev("ndinda");
    }
}