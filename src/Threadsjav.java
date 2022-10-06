public class Threadsjav extends Thread{
    public static void main(String[] args) {
       Threadsjav threads = new Threadsjav();
       threads.start();
        System.out.println("this code is outside the thread");
    }
    public void run(){
        System.out.println("this code is running in a thread");
    }
}