public class Tatu {
    public static void sitty(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
//        setty();
//        created an object called (t)
        Tutu t = new Tutu();
//calling static method setty
        Tutu.setty();

//        calling method setty using an object (T)
        t.setty();
//        calling non static mryhod kita using object (t)
        t.kita();
        t.kitu();
        t.kito();

//        calling mthod sitty in class Tatu
        sitty();
    }
}
