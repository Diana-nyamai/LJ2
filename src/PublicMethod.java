public class PublicMethod {
    public void throttle(){
        System.out.println("The car is moving as fast as it can");
    }
    public void speed(int x){
        System.out.println("The car is moving at a speed of  " + x + " km/hr" );
    }
    public static void main(String[] args) {
      PublicMethod myobj = new PublicMethod();
      myobj.throttle();
      myobj.speed(30);
    }
}