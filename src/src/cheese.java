import java.util.*;

public class cheese {
    public static void main(String[] args) {
        List<String> cheese = new ArrayList<>();
        cheese.add("provolone");
        cheese.add("munster");
        cheese.add("swiss");
        System.out.println("original list: " + cheese);

        reverseList(cheese);
        System.out.println("list post-reverse: " + cheese);
    }

    // Write a Java program to reverse elements in an array list.
    public static void reverseList (List<String> list) {
        Collections.reverse(list);
    }
}
