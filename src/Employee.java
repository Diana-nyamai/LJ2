public class Employee {
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void display(){
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address address = new Address("nairobi","nrb","kenya");
        Employee emp = new Employee(1, "diana",address);
        emp.display();
    }
}
