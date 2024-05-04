package giua_ki.test_oca.cau11;

public class Cau11 {

    /**
     * Câu hỏi: Kết quả của đoạn code sau là gì?
     */
    static void testV1() {
        String s = new String("5");
        System.out.println(1 + 10 + s + 1 + 10);
        //=> kết quả là 115110
    }

    public static void main(String[] args) {
        testV1();
    }
}
