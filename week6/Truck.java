package week6;

public class Truck extends Vechicle{
    
    public Truck(String brand){
        super(brand);
   }


    public void startEngine(){
        System.out.println(brand +":Truck Engine Started");
   }
   public void Carry(){
        System.out.println(brand+"ต่อพ่วงหลัง บันทุกได้18 ตัน");
    }
}
