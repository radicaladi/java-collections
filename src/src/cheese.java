import java.util.*;

public class cheese {
    public static void main(String[] args) {
        List<String> cheese = new ArrayList<>();
        cheese.add("provolone");
        cheese.add("munster");
        cheese.add("swiss");
        System.out.println("original list: " + cheese);
        System.out.println("==========");

        reverseList(cheese);
        System.out.println("list post-reverse: " + cheese);
        System.out.println("==========");

        List<String> cheeseExtracts = extractPortionOfList(cheese, 0, 2);
        System.out.println(cheeseExtracts);
        System.out.println("==========");

        List<String> favoriteCheese = new ArrayList<>();
        favoriteCheese.add("Gorgonzola");
        favoriteCheese.add("Gouda");
        favoriteCheese.add("munster");
        System.out.println(favoriteCheese);
        System.out.println("==========");

        comparedList(cheese, favoriteCheese);
    }

    // Write a Java program to reverse elements in an array list.
    public static void reverseList (List<String> list) {
        Collections.reverse(list);
    }

    // Write a Java program to extract a portion of an array list.
    public static List<String> extractPortionOfList (List<String> list, int indexOne, int indexTwo) {
        return list.subList(indexOne, indexTwo); //must be list from parameter to use sublist method. // requires start and end index values to execute.
//  NOTE: since this program is type: list<String> it must be stored in a list<string> object to print result to console
    }

    // Write a Java program to compare two array lists.
    public static void comparedList (List<String> list1, List<String> list2) {
        boolean check = list1.equals(list2);
        List<String> comparedResult = new ArrayList<>();
        for(String e : list1) {
            comparedResult.add(list2.contains(e) ? "Yes" : "No");
        }
        System.out.println("Do elements match?: " + comparedResult);
        comparedResult.clear();
        for(String e : list1) {
            comparedResult.add(list2.contains(e) ? e : "");
        }
        comparedResult.removeAll(Collections.singleton(""));
        System.out.println("Matching elements: " + comparedResult);
    }

}
