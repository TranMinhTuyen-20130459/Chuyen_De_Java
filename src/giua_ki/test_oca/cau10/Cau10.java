package giua_ki.test_oca.cau10;

public class Cau10 {

    /**
     * Câu hỏi: Kết quả của đoạn code sau là gì?
     */

    static void testV1() {
        int i = 0;
        for (i = 0; i < 10; i++) {
            continue;
        }
        System.out.println(i);//=> kết quả là 10
    }

    /**
     * Câu hỏi: Kết quả của đoạn code sau là gì?
     */

    static void testV2() {
        int i = 0;
        for (i = 0; i < 10; i++) {
            break;
        }
        System.out.println(i);//=> kết quả là 0
    }

    public static void main(String[] args) {
        testV1();
        testV2();
    }
}
