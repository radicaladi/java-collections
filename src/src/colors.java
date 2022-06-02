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
        System.out.println("==========");
        System.out.println(colors); // checking if color inserted
        System.out.println("==========");
        grabAnElement(4, colors);
        System.out.println("==========");
        updateAnElement(0, colors, "violet");
        System.out.println(colors);
        System.out.println("==========");
        removeThirdIndex(colors);
        System.out.println(colors);
        System.out.println("==========");
        searchList(colors, "orange");
        searchList(colors, "violet");
        System.out.println("==========");
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

    // Write a Java program to retrieve an element (at a specified index) from a given array list.
    public static void grabAnElement(int index, List<String> list) {
        String element = list.get(index); // must store it to access it
        System.out.println(element);
    }

    // Write a Java program to update specific array element by given element.
    public static void updateAnElement(int index, List<String> list, String element) {
        list.set(index, element);
    }

    // Write a Java program to remove the third element from an array list.
    public static void removeThirdIndex(List<String> list) {
        list.remove(3);
    }

    // Write a Java program to search an element in an array list.
    public static void searchList(List<String> list, String element) {
        if (list.contains(element)) {
            System.out.println("found it!");
        } else {
            System.out.println("not on the list!");
        }
    }

}
