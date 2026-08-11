package week6;

public class Main {
    

    public static void main(String[] args){
        Car v1 = new Car ("BMW");
        Motorcycle v2 = new Motorcycle("Yamaha");
        Truck v3 = new Truck("Mitsubishi");

        v1.startEngine();
        v2.startEngine();
        v2.fireEx();
        v3.startEngine();
        v1.TurnLeft();
        v1.TurnRight();
        v3.Carry();
        v2.motorcle();

        System.err.println("---------------------");
        v2.stopEndgine();
        v1.stopEndgine();
    }
}
