public class Concurrency extends Thread{
    public static int amount = 0;
    public static void main(String[] args) {
       Concurrency thread = new Concurrency();
       thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);

    }
    public void run(){
//        amount++;
        amount+=2;
    }
}