public class BoxClass {
    int volume;

    public BoxClass(int l, int w, int h){
        this.volume = l*w*h;
    }
    public void display(){
        System.out.println(volume);
    }
}
