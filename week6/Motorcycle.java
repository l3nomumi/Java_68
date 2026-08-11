package week6;

public class Motorcycle extends Vechicle{

    public Motorcycle(String brand){
        super(brand);
    }
    @Override
    public void startEngine(){
        System.out.println(brand +": Motorcycle Engine Started");
    }

    public void fireEx(){
        System.out.println(brand+"มีท่อไอเสียอยู่ด้ายท้าย");
    }
    public void motorcle(){
        System.out.println(brand+"มี2ล้อ");
    }
}
