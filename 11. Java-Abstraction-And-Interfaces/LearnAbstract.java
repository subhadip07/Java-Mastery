
public class LearnAbstract
{
    public static void main(String args[])
    {
        Car c = new Car();
        c.accelerate();
        c.brake(5);
        c.honks();
        
    }
}

abstract class Vehicle
{
    abstract void accelerate();

    abstract int brake(int wheels);

    void honks()
    {
        System.out.println("Vehicle honks");
    }
}

class Car extends Vehicle
{
    @Override
    void accelerate()
    {
        System.out.println("Car is Accelerating");
    }

    @Override
    int brake(int wheels)
    {
        System.out.println("Car brakes are pushed");
        return wheels;
    }
}