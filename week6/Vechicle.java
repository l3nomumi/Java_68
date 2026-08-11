package week6;

public class Vechicle {
    protected String brand;

    public Vechicle(String brand){
        this.brand = brand;
    }

    public void startEngine(){
        System.out.println(":Engine Startted");
    }

    public void stopEndgine(){
        System.out.println("Engine Stopped");
    }
}
