package giua_ki.test_oca.cau9;

public class Cau9 {

    /**
     * Câu hỏi: Kết quả của đoạn code sau là gì?
     */
    static void testV1() {
        String[] strings = new String[2];
        System.out.println(strings);//=> kết quả là một chuỗi biểu diễn địa chỉ bộ nhớ của mảng, ví dụ: [Ljava.lang.String;@15db9742
    }

    public static void main(String[] args) {
        testV1();
    }
}
