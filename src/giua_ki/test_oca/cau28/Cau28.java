package giua_ki.test_oca.cau28;

public class Cau28 {

  /*  static void testV1() {
        int x = 0;
        while (x++ < 10) {}
        String message = x > 10 ? "Greater than" : false; //=> Lỗi biên dịch
        System.out.println(message + "," + x);
    }*/

    static void testV2() {
        int x = 0;
        while (x++ < 10) {
        }
        String message = x > 10 ? "Greater than" : "Smaller than";
        System.out.println(message + "," + x);
    }

    public static void main(String[] args) {
        testV2();
    }
}
