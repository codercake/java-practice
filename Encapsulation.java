//methods and classes must be closely binded altogether 

class Vehicle{
    private int tyres;
    private String model;

public Vehicle(){
    tyres=4;
    model="Latest";
}
public void Accelerator()
{
    System.out.println("Model:"+model);
}
public void Speed()
{
    System.out.println("Perfectly fine for"+tyres+"tyres");
}
/* source action-->getters and setters->enable for spcific objects->click*/

public int getTyres() {
    return tyres;
}
public void setTyres(int tyres) {
    this.tyres = tyres;
}
public String getModel() {
    return model;
}
public void setModel(String model) {
    this.model = model;
}
}


class Car extends Vehicle{
    String License;
    int age;
    boolean available;

    public void License()
    {
    if(age>18){
        System.out.println("Available!");
    }else{
        System.out.println("Get or renew the old license!");
    }
}
}

public class Encapsulation{
    public static void main(String args[]){
        Vehicle ve=new Vehicle();
        ve.setModel("Hayabusa XZ2500 Series!");
        ve.Accelerator();
        ve.Speed();
        System.out.println(ve.getTyres());

        Car ce=new Car();
        ce.License();
    }
}