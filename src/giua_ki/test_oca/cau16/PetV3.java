package giua_ki.test_oca.cau16;

class AnimalV3 {
    public AnimalV3(int age) {
        System.out.print("Animal");
    }

    public AnimalV3() {
        System.out.print("Animal");
    }
}

public class PetV3 extends AnimalV3 {

    public PetV3() {
        System.out.print("Pet");
    }

    public static void main(String[] args) {
        new PetV3();
    }
}
