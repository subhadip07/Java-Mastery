public class FinallyBlockInException 
{
    public static void main(String[] args) 
    {
        int a[] = new int[5];

        System.out.println("Hello World!");

        try
        {
            System.out.println(a[8]);
        }
        catch (Exception e)
        {
            System.out.println("Exception Handled");
        }
        finally
        {
            System.out.println("I will run always");
        }

        System.out.println("Bye World!"); 
        
        try
        {
            getNumberFromArray(a);
        }
        catch (Exception e)
        {
            System.out.println("Catched all exception " + e.getMessage());
        }
    }
    
    static int getNumberFromArray(int a[]) throws ArithmeticException
    {
        return a[8];
    }
}
