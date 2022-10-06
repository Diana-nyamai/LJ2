import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegEx {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("ndinda", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("this is ndinda");
        boolean matchfound = matcher.find();

        if(matchfound){
            System.out.println("match found");
        }
        else{
            System.out.println("match not found");
        }
    }
}