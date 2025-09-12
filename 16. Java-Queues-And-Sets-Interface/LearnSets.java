import java.util.Set;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LearnSets 
{
    enum Color
    {
        RED, GREEN, BLUE
    }

    public static void main(String[] args) 
    {
        Set<Integer> set = new HashSet<>(); // O(1)

        set.add(1);
        set.add(20);
        set.add(50);
        set.add(1);

        System.out.println("\nSet Elements: " + set);

        set.remove(1);
        System.out.println("\nSet Elements after removing 1: " + set);

        Set<Integer> s2 = new LinkedHashSet<>(); // O(n)
        s2.add(1);
        s2.add(20);
        s2.add(50);
        s2.add(10);
        s2.add(25);

        System.out.println("\nLinkedHashSet Elements: " + s2);

        s2.remove(1);
        System.out.println("\nLinkedHashSet Elements after removing 1: " + s2);

        Set<Integer> s3 = new TreeSet<>(); // O(log n)
        s3.add(1);
        s3.add(20);
        s3.add(50);
        s3.add(10);
        s3.add(25);

        System.out.println("\nTreeSet Elements: " + s3);

        s3.remove(1);
        System.out.println("\nTreeSet Elements after removing 1: " + s3);

        System.out.println("\nTreeSet contains 25: " + s3.contains(25));

        System.out.println("\nEnumset Example: ");
        EnumSet<Color> e1 = EnumSet.allOf(Color.class);
        System.out.println("EnumSet allOf: " + Color.RED);
        System.out.println("EnumSet allOf: " + e1);

    }
    
}
