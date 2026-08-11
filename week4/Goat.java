package week4;

public class Goat extends Animal {

    private String hornType;

    public Goat(String name, int age, String hornType) {
        super(name, age);
        this.hornType = hornType;
    }

    public void bleat() {
        System.out.println("กำลังร้อง แบ๊ะ แบ๊ะ");
    }

    public void showHornType() {
        System.out.println("ลักษณะเขา : " + hornType);
    }
    
    public void showCharacteristics() {
        System.out.println("ลักษณะ : มีเขา มีเครา 4 ขา");
    }
}