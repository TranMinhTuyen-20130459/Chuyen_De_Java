package giua_ki.test_oca.cau30;

public class Cau30 {

    static void testV1() {
        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) ^ (z = false); //=> phép toán XOR chỉ trả về true khi 2 toán hạng khác nhau
        System.out.println(x + ", " + y + ", " + z);
        //=> Kết quả: true, 20, false
    }

    static void testV2() {
        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) | (z = false); //=> phép toán OR trả về true khi ít nhất 1 toán hạng là true
        System.out.println(x + ", " + y + ", " + z);
        //=> Kết quả: true, 20, false
    }

    static void testV3() {
        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) & (z = false); //=> phép toán AND trả về true khi cả 2 toán hạng là true
        System.out.println(x + ", " + y + ", " + z);
        //=> Kết quả: false, 20, false
    }

    static void testV4() {
        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) || (z = false); // đây là toán tử logic OR, nếu toán hạng bên trái là true thì toán hạng bên phải không được thực thi
        System.out.println(x + ", " + y + ", " + z);
        //=> Kết quả: true, 20, true
    }


    public static void main(String[] args) {
        testV1();
        testV2();
        testV3();
        testV4();
    }
}
