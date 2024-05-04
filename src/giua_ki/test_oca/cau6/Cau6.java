package giua_ki.test_oca.cau6;

public class Cau6 {

    /**
     * Câu hỏi: Kết quả của đoạn code sau là gì?
     */
    static void testV1() {
        int x = 10;
        while (x > 0) {
            System.out.print(x + " ");
            x--;
        }
    }

    /**
     * Câu hỏi: Kết quả của đoạn code sau là gì?
     */
    static void testV2() {
        int x = 10;
        while (x > 0) {
            System.out.print(x + " ");
            --x;
        }
    }

    /**
     * Câu hỏi: Kết quả của đoạn code sau là gì?
     */
    static void testV3() {
        int x = 10;
        while (x > 0) {
            --x;
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        testV1();
        System.out.println("\n----------------");
        testV2();
        System.out.println("\n----------------");
        testV3();
    }
}
