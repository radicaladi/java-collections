import java.util.*;

public class cars {
    public static void main(String[] args) {
        LinkedList<String> carTypes = new LinkedList<String>();
        carTypes.add("Sedan");
        carTypes.add("SUV");
        System.out.println("List of first linked list: " + carTypes);

        LinkedList<String> carTypes2 = new LinkedList<String>();
        carTypes2.add("Coupe");
        carTypes2.add("Minivan");
        System.out.println("List of second linked list: " + carTypes2);

        LinkedList<String> joinedList = linking_two_lists(carTypes, carTypes2);
        System.out.println("New linked list: " + joinedList);

        ArrayList<String> autos = new ArrayList<>();
        autos.add("Audi");
        autos.add("BMW");
        autos.add("Volkswagen");
        System.out.println("Autos before emptied: " + autos);
        emptyList(autos);
        System.out.println("Autos emptied: " + autos);
    }

    public static LinkedList<String> linking_two_lists(LinkedList<String> listOne, LinkedList<String> listTwo) {
        LinkedList<String> joinedList = new LinkedList<String>();
        joinedList.add(String.valueOf(listOne));
        joinedList.add(String.valueOf(listTwo));
        return joinedList;
        }

    //Write a Java program to empty an array list.
    public static void emptyList (ArrayList<String> list) {
        list.removeAll(list);
    }

}
