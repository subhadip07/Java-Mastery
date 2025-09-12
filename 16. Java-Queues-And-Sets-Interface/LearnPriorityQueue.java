import java.util.*;
public class LearnPriorityQueue 
{
    public static void main(String[] args)
    {
        Queue<Integer> q = new PriorityQueue<>();
        q.add(30);
        q.add(40);
        q.add(10);
        q.add(20);

        System.out.println("\nQueue after adding elements: " + q);

        System.out.println(q.poll());
        System.out.println("\nQueue after polling: " + q);
        System.out.println(q.poll());
    }
}