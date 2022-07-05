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

        countSizeOfHashMap(jordanShoes);

        HashMap<Integer, String> jordanShoes2 = new HashMap<>();
        jordanShoes2.put(4, "Cement");
        jordanShoes2.put(5, "Bred");
        System.out.println("jordan list 2 before copy: " + jordanShoes2);

        copyAllMappingsToSeparateMap(jordanShoes,jordanShoes2);
        System.out.println("Jordan list 2 after copy: " + jordanShoes2);

        boolean checkEmpty1 = checkForEmptyKeyValues(jordanShoes2); //checking before emptied
        System.out.println("is this hashmap empty?: " + checkEmpty1);

        emptyHashMap(jordanShoes2);
        System.out.println("Jordans2 list after empty: " + jordanShoes2);

        boolean checkEmpty2 = checkForEmptyKeyValues(jordanShoes2); //checking after empty
        System.out.println("is this hashmap empty?: " + checkEmpty2);

    }

    // Write a Java program to associate the specified value with the specified key in a HashMap.
    public static void hashMapKeyValuePairs (HashMap<Integer, String> map) {
        for(Map.Entry x:map.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }

    //Write a Java program to iterate through all elements in a hash map.
    public static void iterateAllElementsInHashMap (Iterator<Map.Entry<Integer, String>> iterator) {
        while(iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(", ");
        }
        System.out.println("\n");
    }

    //Write a Java program to count the number of key-value (size) mappings in a map.
    public static void countSizeOfHashMap (HashMap<Integer, String> map) {
        System.out.println("Size of this hash map: " + map.size());
    }

    //Write a Java program to copy all the mappings from the specified map to another map.
    public static void copyAllMappingsToSeparateMap (HashMap<Integer, String> map1, HashMap<Integer, String> map2) {
        map2.putAll(map1);
    }

    //Write a Java program to remove all the mappings from a map
    public static void emptyHashMap (HashMap<Integer, String> map) {
        map.clear();
    }

    //Write a Java program to check whether a map contains key-value mappings (empty) or not.
    public static boolean checkForEmptyKeyValues (HashMap<Integer, String> map) {
        return map.isEmpty();
    }
}
