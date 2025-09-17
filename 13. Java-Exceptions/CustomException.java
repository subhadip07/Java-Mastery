import java.util.Scanner;

public class CustomException 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        
        try
        {
            int age = sc.nextInt();
            if(age > 100)
            {
                throw new ArithmeticException("More than 100 not allowed");
                    
            }
        } catch (Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            sc.close();
        }
        
    }    
}

class MyException extends Exception
{
    public MyException(String message)
    {
        super(message);
    }
}
