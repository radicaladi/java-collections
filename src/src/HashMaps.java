import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> jordanShoes = new HashMap<>();
        jordanShoes.put(1, "Carmine");
        jordanShoes.put(2, "Raptor");
        jordanShoes.put(3, "Concord");

        hashMapKeyValuePairs(jordanShoes);

    }

    // Write a Java program to associate the specified value with the specified key in a HashMap.
    public static void hashMapKeyValuePairs (HashMap<Integer, String> map) {
        for(Map.Entry x:map.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}
