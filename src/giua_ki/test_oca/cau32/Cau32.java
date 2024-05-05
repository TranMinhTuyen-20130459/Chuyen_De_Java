package giua_ki.test_oca.cau32;

public class Cau32 {

    /*
    static void testV1() {
        byte a = 40, b = 50;
        byte sum = (byte) a + b; //=> Lỗi biên dịch vì phép cộng 2 biến byte sẽ trả về kiểu int
        System.out.println(sum);
    }
    */

    static void testV2() {
        byte a = 40, b = 50;
        int sum = (byte) a + b;
        System.out.println(sum); //=> Kết quả: 90 (kiểu int)
    }

    static void testV3() {
        byte a = 40, b = 50;
        byte sum = (byte) (a + b);
        System.out.println(sum); //=> Kết quả: 90 (vì a + b trả về kiểu int, sau đó ép kiểu về byte)
    }

    public static void main(String[] args) {
        testV2();
        testV3();
    }
}
