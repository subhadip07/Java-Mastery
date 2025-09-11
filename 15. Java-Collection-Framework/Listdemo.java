import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class Listdemo
{
    public static void main(String args[])
    {

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // adding elements to the list
        System.out.println("\nAdding elements to the list");
        list.add(10);
        list.add(20);
        list.add(30);

        // printing the list
        System.out.println("\nDisplaying the list");
        System.out.println(list);

        // displaying the size of the list
        System.out.println("\nDisplaying the size of the list");
        System.out.println(list.size());

        // element is present or not
        System.out.println("\nElement is present or not");
        System.out.println(list.contains(20));

        // removing an element from list using index
        System.out.println("\nRemoving an element from list using index");
        list.remove(1);

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list.addAll(list2);

        list.removeAll(list2);


        // removing an element from list using object
        System.out.println("\nAfter removing an element from list using object");
        list.remove(Integer.valueOf(30));
        System.out.println(list);
    }
}