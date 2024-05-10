class Car
{
    public void Start()
    {
        System.out.println("car is started");
    }
    public void accelerate()
    {
        System.out.println("car is accelerated");
    }
    public void changeGear()
    {
        System.out.println("car gear is changed as manual");
    }
}
class LuxaryCar extends Car
{
    public void changeGear()
    {
        System.out.println("Luxarycar gear is changed as automated");
    }
}

    public class Overriding2
    {
    public static void main(String args[])
    {
        Car c=new LuxaryCar();
        c.Start();
        c.accelerate();
       c.changeGear();


    }
    }
