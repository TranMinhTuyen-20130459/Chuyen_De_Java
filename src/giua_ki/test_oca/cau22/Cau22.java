package giua_ki.test_oca.cau22;

public class Cau22 {

    static void testV1() {
        int x = 10;
        do {
            x--;
            System.out.println(x);
        } while (x < 10);
        //=> Kết quả : lặp vô hạn
    }

    public static void main(String[] args) {
        testV1();
    }
}
