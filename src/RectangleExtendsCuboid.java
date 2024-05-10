class Rectangle
{
    int length;
    int breadth;
    Rectangle()
    {
        System.out.println("no parameter of rectangle");
        length=1;
        breadth=1;
        //System.out.println(no parameter of rectangle);
    }
    Rectangle(int l, int b)
    {
        length=l;
        breadth=b;
    }

}
class Cuboid extends Rectangle
{
    int height;
    Cuboid()
    {
        System.out.println("no parameter of cuboid");
        height=1;
    }
    Cuboid(int l, int b,int h)
    {
       super(l,b);
        height=h;
    }
    int volume()
    {
        return length*breadth*height;
    }
}

public class RectangleExtendsCuboid
{
    public static void main(String args[])
    {
        Cuboid c=new Cuboid(5,3,10);
        System.out.println("volume is"+c.volume());
    }
}
