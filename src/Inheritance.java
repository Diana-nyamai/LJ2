public class Inheritance extends Parent{
    private String carname = "mercedes";
    public static void main(String[] args) {
      Inheritance car = new Inheritance();
      car.Honk();
        System.out.println("Brand is " + car.brand + " the car name " + car.carname);
    }
}
