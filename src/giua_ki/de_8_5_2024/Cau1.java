package giua_ki.de_8_5_2024;

public class Cau1 {

    static void testV1() {
        int luck = 10;
        if ((luck > 10 ? luck++ : --luck) < 10) {
            System.out.print("Bear");
        }
        if (luck < 10) System.out.print("Shark"); //=> Kết quả: BearShark
    }

    static void testV2() {
        int luck = 10;
        if ((luck > 10 ? luck++ : --luck) < 10) {
            System.out.print("Bear");
        } else {
            System.out.print("Shark");
        }
        //=> Kết quả: Bear
    }

    static void testV3() {
        int luck = 10;
        if ((luck > 10 ? luck++ : luck--) < 10) {
            System.out.print("Bear");
        } else {
            System.out.print("Shark"); //=> Kết quả: Shark
        }
    }

    public static void main(String[] args) {
        testV1();
        System.out.println("");
        testV2();
        System.out.println("");
        testV3();
    }
}
