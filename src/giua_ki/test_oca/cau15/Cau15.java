package giua_ki.test_oca.cau15;

public class Cau15 {

    /**
     * Câu hỏi: Kết quả của đoạn code sau là gì?
     */
    static void testV1() {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1 == s2 is:" + s1 == s2); //=> kết quả là false

        /**
         * Trong Java, toán tử + có độ ưu tiên cao hơn so với toán tử ==.
         * Do đó, "s1 == s2 is:" + s1 sẽ được thực hiện trước, tạo ra một chuỗi mới. Sau đó, chuỗi mới này sẽ được so sánh với s2 bằng toán tử ==, và rõ ràng chuỗi mới này không bằng s2, nên kết quả là false.
         * */
    }

    public static void main(String[] args) {
        testV1();
    }
}
