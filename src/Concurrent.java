public class Concurrent extends Thread{
    public static int amount = 0;
    public static void main(String[] args) {
      Concurrent thread = new Concurrent();
      thread.start();
      while(thread.isAlive()){
          System.out.println("waiting...");
      }
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    public void run(){
        amount++;
    }
}