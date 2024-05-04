package giua_ki.test_oca.cau5;

public class Cau5 {

    /**
     * Câu hỏi: Kết quả của đoạn code sau là gì?
     */
    static void testV1() {
        int x = 5;
        int y = 10;
        System.out.println(x + y + "Hello");
        //=> kết quả là 15Hello
    }

    /**
     * Câu hỏi: Kết quả của đoạn code sau là gì?
     */
    static void testV2() {
        int x = 5;
        int y = 10;
        System.out.println("Hello" + x + y);
        //=> kết quả là Hello510
    }

    public static void main(String[] args) {
        testV1();
        testV2();
    }

}
