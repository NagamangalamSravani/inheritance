class Parent1
{
    public Parent1()
    {
        System.out.println("non parameter of parent");
    }
    public Parent1(int x)
    {
        System.out.println("parameter of parent"+x);
    }
}
class Child1 extends Parent1
{
    public Child1()
    {
        System.out.println("non parameter of child");
    }
    //public Child1(int y)
    //{
     //   System.out.println("parameter of child");
   // }
    public Child1(int x,int y)
    {
        super(x);
        System.out.println("2 paramter of child"+y

        );
    }
}
public class ParameterNonParameterParentChild
{
    public static void main(String args[])
    {
        Child1 c=new Child1(10,20);
    }
}
