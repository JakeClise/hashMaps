import java.util.HashMap;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args){
        //Create HashMap
        HashMap<String, String> userMap = new HashMap<String, String>();
        //Putting in key-value pairs
        userMap.put("jhclise@gmail.com", "Jake Clise");
        userMap.put("jesseclise@gmail.com", "Jesse Clise");
        //And get them out
        /*String name = userMap.get("jhclise@gmail.com");
        System.out.println(name);*/
        //Iterating over HashMap
        Set <String> keys = userMap.keySet();
        for (String key : keys){
            System.out.println(key);
            System.out.println(userMap.get(key));
        }
        //New HashMap (States and Cities)
        HashMap<String, String> stateMap = new HashMap<String, String>();

        stateMap.put("Baltimore", "Maryland");
        stateMap.put("Tulsa", "Oklahmoa");
        stateMap.put("Richmond", "Virginia");
        stateMap.put("Baton Rouge", "Louisiana");
        stateMap.put("Raliegh", "North Carolina");

        //System.out.println(stateMap);
        Set <String> stateKeys = stateMap.keySet();
        for(String key : stateKeys){
            System.out.println(key);
            System.out.println(stateMap.get(key));
        }

        //HashMap with Ints?
        HashMap <String, Integer> countMap = new HashMap<String, Integer>();

        countMap.put("Cheeseburgers", 10);
        countMap.put("Kit-Kats", 45);
        countMap.put("Water Bottles", 12);
        countMap.put("Paper Towels", 4);

        Set <String> countKeys = countMap.keySet();
        for (String key : countKeys){
            System.out.println(key);
            System.out.println(countMap.get(key));
        }
    }
}