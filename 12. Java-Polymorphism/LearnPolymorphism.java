class Data
{
    int data;
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
    }

    static void changeValue(int a, Data obj)
    {
        a = 10;
        obj.data = 100;
    }
}