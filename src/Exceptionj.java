public class Exceptionj {
        public static int CheckAge(int age){
            if(age < 18){
                System.out.println("access denied!");
            }
            else {
                System.out.println("access granted!");
            }
            return age;
        }
    public static void main(String[] args) {
      CheckAge(21);
    }
}
