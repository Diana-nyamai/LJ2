import java.io.File;

public class Createfile {
    public static void main(String[] args) {
        File obj = new File("newsfile.txt");
        try {
            if(obj.createNewFile()){
                System.out.println(obj.getName());
            }
            else{
                System.out.println("file already exists");
            }
        }
        catch (Exception e){
            System.out.println("something went wrong!");
        }

    }
}