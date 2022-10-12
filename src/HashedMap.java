import java.util.HashMap;

public class HashedMap {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<String, String>();
        countries.put("Kenya", "Nairobi");
        countries.put("Tanzania", "dar-eslam");
        countries.put("uganda", "kampala");

        for(String i : countries.values()){
            System.out.println(i);
        }
        for (String a: countries.keySet()){
            System.out.println("key: " + a + " Values: " + countries.get(a));
        }
        System.out.println(countries.size());
    }
}