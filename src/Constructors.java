public class Constructors {
    int x;
    public Constructors(){
        x= 5;
    }
    public static void main(String[] args) {
      Constructors myobj = new Constructors();
      int p = myobj.x;
        System.out.println(p);
    }
}