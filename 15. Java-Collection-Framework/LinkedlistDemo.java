import java.util.*;
public class LinkedlistDemo 
{
    public static void main(String[] args) 
    {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(30);
        list.add(20);

        System.out.println("\nDisplaying the list");
        System.out.println(list);

        // get method
        System.out.println("\nGet method: ");
        System.out.println("Element at index 1: ");
        System.out.println(list.get(1));
        
        // set method
        System.out.println("\nSet method: ");
        System.out.println("Setting element at index 1 to 200");
        list.set(1, 200);
        System.out.println(list);

        // add method with index
        System.out.println("\nAdd method with index:");
        list.add(2, 300);
        System.out.println(list);

        // remove method with index
        System.out.println("\nRemove method with index: ");
        System.out.println(list.indexOf(300));
    }
}
