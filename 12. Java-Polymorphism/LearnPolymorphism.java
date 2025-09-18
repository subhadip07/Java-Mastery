class Data
{
    int data;

    public void printData()
    {
        System.out.println(data);
    }

    public void printData(int times)
    {
        for(int i = 0; i<times; i++)
        {
            System.out.println(data);
        }    
    }
}

class ChildData extends Data
{
    @Override
    public void printData()
    {
        System.out.println("Overriden " + data);
    }
}

class LearnPolymorphism 
{
    public static void main(String[] args) 
    {
        Integer a = 5;
        Data obj = new Data();
        obj.data = 50;
        changeValue(a, obj);
        System.out.println(a);
        System.out.println(obj.data);


        Data d;
        d = new ChildData();
        d.printData(); // runtime polymorphism aka Method Overriding

        Data d2 = new Data();
        d2.printData(3); // compile time polymorphism aka Method Overloading
    }

    static void changeValue(int a, Data obj)
    {
        a = 10;
        obj.data = 100;
    }
}