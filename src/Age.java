public class Age {
    static void CheckAge(int age){
       if(age < 18){
           System.out.println("access denied!");
       }
       else{
           System.out.println("access granted!");
       }
    }
    public static void main(String[] args) {
        CheckAge(5);

    }
}