public class WrapperClasses 
{
    public static void main(String[] args) 
    {
        Integer obj = new Integer(10);

        Integer obj2 = 20; // Autoboxing
        System.out.println(obj2);

        Integer obj3 = Integer.valueOf("30");

        System.out.println(obj3+10);

        Boolean b = Boolean.valueOf("False");
        System.out.println(b);

        int age = obj; // Unboxing
        System.out.println(age);
    }
}