public class BoxClass2 {
    private int volume;

    BoxClass2(int l, int w, int h){
        this.volume = l*w*h;
    }
    public int getVolume(){
        return volume;
    }
    public void display(){
        System.out.println(getVolume());
    }

}
