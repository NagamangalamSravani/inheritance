class Super
{
    public void display()
    {
        System.out.println("hello");
    }
}
class Sub extends Super
{
    public void display()
    {
        System.out.println("Hello world");
    }
}
public class Overriding
{
    public static void main (String args[])
    {
        //Super sup=new Super();
        //sup.display();
        //Sub s=new Sub();
        //s.display();
        Super sup=new Sub();
        sup.display();
    }
}
