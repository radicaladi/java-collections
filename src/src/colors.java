import java.lang.reflect.Array;
import java.util.*;

// Write a Java program to create a new array list,
// add some colors (string) and print out the collection

public class colors {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        System.out.println(colors);

        iterateColors(colors);
        insertToAL(colors, "black");
        System.out.println(colors);
    }
    // Write a Java program to iterate through all elements in an array list.
    public static void iterateColors(List<String> list) {
        for (String l : list) {
            System.out.println(l);
        }
    }

    // Write a Java program to insert an element into the array list at the first position.
    public static void insertToAL(List<String> list, String element) {
        list.add(0, element);
    }
}
