import java.util.*;

public class LearnComparableAndComparator 
{
    public static void main(String[] args) 
    {
        Animal a1 = new Animal(4, "Leo", 10);
        Animal a2 = new Animal(2, "Max", 12);
        Animal a3 = new Animal(3, "Bella", 8);
        Animal a4 = new Animal(2, "Aloo", 6);

        List<Animal> dogs = new ArrayList<>();

        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);

        System.out.println(dogs);

        Collections.sort(dogs, new Comparator<Animal>())
        {
            @Override
            public int compare(Animal o1, Animal o2)
            {
                return 0;
            }
        }

        System.out.println(dogs);
    }    
}
