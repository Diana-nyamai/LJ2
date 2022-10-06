public class Threadsja implements Runnable{
    public static void main(String[] args) {
        Threadsjav obj = new Threadsjav();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("code running out of thread");
    }

    public void run() {
        System.out.println("code running in a thread");
    }
}