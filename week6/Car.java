package week6;

public class Car extends Vechicle{
    

    public Car(String brand){
        super(brand);
    }

    @Override
    public void startEngine(){
        System.err.println(brand +": Car Engine Started");
    }
      
    public void TurnLeft(){
        System.out.println(brand+"เลี้ยวซ้าย");
    }
    public void TurnRight(){
        System.out.println(brand+"เลี้ยวขวา");
    }
}
