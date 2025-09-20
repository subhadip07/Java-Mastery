public class LearnInnerClass 
{
    class Toy
    {
        int price;
    }

    static class Playstation
    {
        int price;
    }

    public static void main(String[] args) 
    {
        LearnInnerClass obj = new LearnInnerClass();
        Toy toy = obj.new Toy();
        toy.price = 50;
        System.out.println(toy.price);

        Playstation ps = new LearnInnerClass.Playstation();
        ps.price = 300;
        System.out.println(ps.price);
    }
    
}
