import java.util.*;

public class LearnQueue 
{
    public static void main(String args[])
    {
        Queue<Integer> q = new LinkedList<>();

        System.out.println("\nQueue add operations");
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        System.out.println("\nQueue after add operations:");
        System.out.println(q);

        System.out.println("\nQueue poll operations:");
        System.out.println(q.poll());

        System.out.println(q);

        System.out.println("\nQueue after peek operations:");
        System.out.println(q.peek());

        System.out.println(q);

        System.out.println("\nQueue after isEmpty operations:");
        while(!q.isEmpty())
        {
            System.out.println(q.poll());
        }
    }
}