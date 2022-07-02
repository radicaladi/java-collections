import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> jordanShoes = new HashMap<>();
        jordanShoes.put(1, "Carmine");
        jordanShoes.put(2, "Raptor");
        jordanShoes.put(3, "Concord");

        hashMapKeyValuePairs(jordanShoes);

        Iterator<Map.Entry<Integer, String>> jordanIterator = jordanShoes.entrySet().iterator();
        iterateAllElementsInHashMap(jordanIterator);

    }

    // Write a Java program to associate the specified value with the specified key in a HashMap.
    public static void hashMapKeyValuePairs (HashMap<Integer, String> map) {
        for(Map.Entry x:map.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }

    //Write a Java program to iterate through all elements in a hash list.
    public static void iterateAllElementsInHashMap (Iterator<Map.Entry<Integer, String>> iterator) {
        while(iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(", ");
        }
    }
}
