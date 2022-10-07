public class Circle extends Shapes{
    Circle(int width){
        this.width = width;
    }
    public void area(){
        System.out.println(Math.PI*width*width);
    }
}