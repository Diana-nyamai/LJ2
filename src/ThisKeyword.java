public class ThisKeyword {
    String  name;
    int age;

    ThisKeyword(String name, int age ){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println(name + age);
    }
}
