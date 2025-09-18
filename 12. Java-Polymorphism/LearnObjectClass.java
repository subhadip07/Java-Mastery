import java.util.Objects;

class Car
{
    String model;
    int year;

    public Car(String model, int year)
    {
        this.model = model;
        this.year = year;
    }

    public boolean equals(Object obj)
    {
        Car that = (Car)obj;
        if(this.model.equals(that.model) && this.year == that.year)
        {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(model, year);
    }
}


public class LearnObjectClass 
{
    public static void main(String[] args) 
    {
        Car obj1 = new Car("Honda", 2022);
        Car obj2 = new Car("Honda", 2022);

        System.out.println(obj1.equals(obj2));
        System.out.println(obj1);
        System.out.println(obj2);
    
    }    
}