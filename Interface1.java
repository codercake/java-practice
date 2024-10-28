// interface Hello
// {
//     public default void Language()
//     {
//         System.out.println("Done!");
//     }
// }
// class New implements Hello
// {
//     public void Language()
//     {
//         System.out.println("Okay!");
//     }
// }
// class Interface1
// {
//     public static void main(String a[]){
//         Hello hl=new New();
//         hl.Language();
//     }
//     }

//implementing multiple interfaces

interface Computer
{
    int price=127800;
    void compiler();
}

interface Portable
{
    void movable();
}

class Desktop implements Computer 
{
    public void compiler()
    {
        System.out.println("Compiling Faster..(By Desktop)");
    }
}

class Laptop implements Computer, Portable
{
    public void compiler()
    {
        System.out.println("Compiling..(By Laptop)");
    }
    public void movable()
    {
        System.out.println("Moving...");
    }
}

class Dev{
    public void code(Computer desk)
    {
        System.out.println("Writing code..");
        desk.compiler();
    }
}
class Interface1
{
    public static void main(String a[])
{
    Computer desk=new Desktop();
    Computer lap=new Laptop();
    Dev dev=new Dev();
    dev.code(lap);
    dev.code(desk);

    System.out.println(Computer.price);
}}

