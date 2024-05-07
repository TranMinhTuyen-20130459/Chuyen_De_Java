package giua_ki.test_oca.cau16;

class AnimalV2 {

    public AnimalV2(int age) {
        System.out.print("Animal");
    }

    public AnimalV2() {
        System.out.print("Animal");
    }

}

public class PetV2 extends AnimalV2 {

    public PetV2() {
        System.out.print("Pet");
    }

    public static void main(String[] args) {
        new AnimalV2(5);
    }
}
