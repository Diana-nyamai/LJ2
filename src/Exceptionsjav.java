public class Exceptionsjav {

    public static void main(String[] args) {
        try{
            int [] numbers = {3,4,6};
            int res = numbers[0];
            System.out.println(res);
        }
        catch (Exception e){
            System.out.println("something went wrong!");
        }


    }
}