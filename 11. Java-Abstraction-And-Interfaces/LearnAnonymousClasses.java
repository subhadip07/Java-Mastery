public class LearnAnonymousClasses 
{
    OuterClass obj = new OuterClass()
    {
        void sing()
        {
            System.out.println("Singing");
        }

        public void outerMethod()
        {

        }
    };

    SuperInterface obj2 = new SuperInterface()
    {
        @Override
        public void interfaceMethod()
        {

        }
    };

    SuperInterface obj3 = () -> 
    {

    };

    public static void main(String[] args) 
    {
        WalkAble walkable = (steps) ->
        {
            System.out.println("Walked " + steps + " steps");
            return steps;
        };

        walkable.walks(5);

        WalkAble obj2 = (steps) -> 2*steps;
        System.out.println(obj2.walks(8));
    }        
}

interface WalkAble
{
    int walks(int steps);
}

class OuterClass
{
    public void outerMethod()
    {

    }
}

@FunctionalInterface
interface SuperInterface
{
    void interfaceMethod();    
}
