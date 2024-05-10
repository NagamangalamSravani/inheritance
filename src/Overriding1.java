class Tv
{
    public void SwitchOn()
    {
        System.out.println("Tv is switched on");
    }
    public void changeChannel()
    {
        System.out.println("Tv channel is changed");
    }
}
class SmartTv extends Tv
{
    public void SwitchOn()
    {
        System.out.println("SmartTv is switched on");
    }
    public void changeChannel()
    {
        System.out.println("SmartTv channel is changed");
    }
    public void browse()
    {
        System.out.println("Smart tv is browsing");

    }
}

    public class Overriding1
{
public static void main (String args[])
{
    Tv t=new SmartTv();
    t.changeChannel();
    t.SwitchOn();
    //t.browse();
}
}

