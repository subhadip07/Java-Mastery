class LearnException
{
    public static void main(String[] args) 
    {
        int a[] = new int[5];

        System.out.println("Hello guys");

        try
        {
            int res = 5/0;
            System.out.println(a[8]);
            
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e)
        {
            System.out.println("Tried to access the out of bound element");
        }
        catch (Exception e)
        {
            System.out.println("Handled the exception." + e);
        }

        System.out.println("Bye guys");
    }
}