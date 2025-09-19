public class LearnInterface 
{
    public static void main(String[] args) 
    {
        Monkey m1 = new Monkey();
        m1.eats();
        m1.drink();
        System.out.println(Animal.LEGS);
        
    }

    
}

interface Pet 
{
    void play();
    void drink();
}

interface Animal 
{
    public static final int LEGS = 4;
    void eats();
    void drink();
    default void walk()
    {
        System.out.println("Animal is walking.");
    }
}

class Monkey implements Animal, Pet
{
    public void eats()
    {
        System.out.println("Monkey eats banana");
    }

    public void play()
    {
        System.out.println("Monkey plays with its tail.");
    }

    public void drink()
    {
        System.out.println("Monkey drinks water");
    }
}
