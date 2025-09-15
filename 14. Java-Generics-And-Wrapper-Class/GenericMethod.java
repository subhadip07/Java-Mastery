public class GenericMethod 
{
    public static void main(String[] args)
    {
        printData("Hello");
        printData(542);

        // Bounded generic method
        GenericMethod gm = new GenericMethod();
        gm.show(452);
    }

    static <E> void printData(E data)
    {
        System.out.println(data);
    }

    <E> void show(E data)
    {
        System.out.println(data);
    }
}
