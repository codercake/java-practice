class Keyboard 
{
    int keys;
    String color;

    //constructors can also be used to assign the values respectively instead of declaring it in the global access specifier

    public Keyboard(){
        keys=266;
        color="Grey";
    }

    public void pressed(){
        System.out.println("Signal sent" + color);
    }

    public void throwIt(){
        System.out.println("Got hit!");
        keys=86;
    }
}

class Inheritance{
    public static void main(String args[]){
        Keyboard kd=new Keyboard();
        kd.pressed();
        kd.throwIt();;
    }
}
