import java.util.*;
public class ListIterator 
{
    public static void main(String[] args) 
    {
        List<String> fruits = new ArrayList<>();

        fruits.add("Kiwi");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Apple");

        for(int i=0; i<fruits.size(); i++)
        {
            System.out.println("\nFruit is " + fruits.get(i));
        }

        for(String fruit: fruits)
        {
            System.out.println("\nFruit is " + fruit);
        }

        Iterator<String> it = fruits.iterator();
        
        while(it.hasNext())
        {
            System.out.println("\nIterator " + it.next());
        }

        List<String> smallist = fruits.subList(1, 3);
        System.out.println(smallist);


        // Stack demo
        Stack<String> s1 = new Stack<>();

        s1.push("a");
        s1.push("b");
        s1.push("c");

        System.out.println(s1.pop());
        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1);;

        System.out.println(s1.empty());
        
    }
    
}
