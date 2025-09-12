import java.util.*;
public class LearnDeque 
{
    public static void main(String[] args) 
    {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        // Adding elements to the front and back of the deque
        dq.offerFirst(10);
        dq.offerLast(20);
        dq.offerFirst(5);
        dq.offerLast(30);

        System.out.println("Deque after adding elements: " + dq);

        // Removing elements from the front and back of the deque
        System.out.println("Removed from front: " + dq.pollFirst());
        System.out.println("Removed from back: " + dq.pollLast());

        System.out.println("Deque after removing elements: " + dq);

        // Peeking at the front and back elements
        System.out.println("Front element: " + dq.peekFirst());
        System.out.println("Back element: " + dq.peekLast());

        System.out.println("Final state of Deque: " + dq);

        System.out.println("Queue operations using Deque: ");
        ArrayDeque<Integer> q = new ArrayDeque<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);

        System.out.println("Queue: " + q);
        System.out.println("Removed from Queue: " + q.poll());

    }
    
}
