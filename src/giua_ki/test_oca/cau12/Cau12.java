package giua_ki.test_oca.cau12;

public class Cau12 {

    /**
     * Câu hỏi: Kết quả của đoạn code sau là gì?
     */
    static void testV1() {
        char c = 65; // => 65 <=> ký tự 'A' trong bảng mã ASCII
        System.out.println("c= " + c);//=> kết quả là c= A
    }

    /**
     * Câu hỏi: Kết quả của đoạn code sau là gì?
     */
    static void testV2() {
        int c = 65;
        System.out.println("c= " + c);//=> kết quả là c= 65
    }

    public static void main(String[] args) {
        testV1();
        testV2();
    }
}
