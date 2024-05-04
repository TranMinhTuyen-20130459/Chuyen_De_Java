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
        //=> kết quả là 10 9 8 7 6 5 4 3 2 1
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
        //=> kết quả là 10 9 8 7 6 5 4 3 2 1
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
        //=> kết quả là 9 8 7 6 5 4 3 2 1 0
    }

    /**
     * Câu hỏi: Kết quả của đoạn code sau là gì?
     */
    static void testV4() {
        int x = 10;
        while (x > 0) {
            x--;
            System.out.print(x + " ");
        }
        //=> kết quả là 9 8 7 6 5 4 3 2 1 0
    }


    public static void main(String[] args) {
        testV1();
        System.out.println("\n----------------");
        testV2();
        System.out.println("\n----------------");
        testV3();
        System.out.println("\n----------------");
        testV4();
    }
}
