public class TT {
    private int x;
     public int getInte(){
         return x;
     }
     public int setInte(int inter){
      return this.x = inter;
     }

    public static void main(String[] args) {
     TT init = new TT();
     init.setInte(6);
     int gett = init.getInte();
        System.out.println(gett);




    }
}
