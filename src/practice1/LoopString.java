package practice1;

public class LoopString {
    public static void main(String[] args) {
        String s = "diana";
//        using the native method
       for(int i=0; i<s.length(); i++){
           System.out.println(s.charAt(i) + " ");
       }
//       using tocharArray
        char[] ch = s.toCharArray();
       for(int j=0; j<ch.length; j++){
           System.out.println("using chararray "+ ch[j] );
       }
       for(char i: ch){
           System.out.println(i + " chararray foreach");
       }

//       using split
        String subs[] = s.split("");
       for(String i: subs){
           System.out.println(i);
       }
    }
}
