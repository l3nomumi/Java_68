package week4;

public class Lion extends Animal {

    private String maneColor;

    public Lion(String name, int age, String maneColor) {
        super(name, age);
        this.maneColor = maneColor;
    }

    public void roar() {
        System.out.println("กำลังคำราม โฮก!");
    }

    public void showManeColor() {
        System.out.println("สีแผงคอ : " + maneColor);
    }
    
    public void showCharacteristics() {
         System.out.println("ลักษณะ : มีแผงคอ มีหาง 4 ขา");
    }
}