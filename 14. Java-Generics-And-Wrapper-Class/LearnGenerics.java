public class LearnGenerics 
{
    public static void main(String[] args) 
    {
        // Creating a generic box for Integer
        Dog<Integer, String> d1 = new Dog(1, "Buddy");
        System.out.println(d1.getname());

        Dog<Integer, String> d2 = new Dog(2, "Max");
        System.out.print(d2.getid());

        Dog<Integer, String> d3 = new Dog(3, "Alo");
        System.out.println(d3.getid());
       
    }    
}

class Dog<E, V>
{
    E id;
    V name;

    public Dog(E id, V name)
    {
        this.id = id;
        this.name = name;
    }

    E getid()
    {
        return id;
    }

    V getname()
    {
        return name;
    }
}
