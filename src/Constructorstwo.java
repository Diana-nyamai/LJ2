public class Constructorstwo {
    int x;
    public Constructorstwo(int y){
         x = y;
    }
    public static void main(String[] args) {
     Constructorstwo myobj = new Constructorstwo(20);
     int p = myobj.x;
        System.out.println(p);
    }
}