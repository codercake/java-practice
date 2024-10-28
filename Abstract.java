//METHOD 1 BY INVOKING SPECIFIC OBJECT
//METHOD 2 USING ABSTRACTION

//cannot instantiate abstract class
abstract class Computer
{
    // int price=9000;
    public abstract void compiler();
}

class Desktop extends Computer
{
    public void compiler()
    {
        System.out.println("Compiling Faster..(By Desktop)");
    }
}


class Laptop extends Computer
{
    public void compiler()
    {
        System.out.println("Compiling..(By Laptop)");
    }
}

class Dev{
    public void code(Computer desk)
    {
        System.out.println("Writing code..");
        desk.compiler();
    }
}
class Abstract
{
    public static void main(String a[])
{
    Computer desk=new Desktop();
    Computer lap=new Laptop();
    Dev dev=new Dev();
    dev.code(lap);
    dev.code(desk);

}}

