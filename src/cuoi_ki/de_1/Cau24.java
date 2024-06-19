package cuoi_ki.de_1;

public class Cau24 {

    /**
     * Cho đoạn chương trình sau:
     * public class Test {
     * int x = 1;
     * public void method(int x) {
     * x += this.x;
     * System.out.println(x);
     * }
     * public static void main(String[] args) {
     * Test t = new Test();
     * t.method(10);
     * }
     * }
     * Kết quả sẽ là gì?
     * a. 2
     * b. 11
     * c. 20
     * d. Lỗi biên dịch
     * <p>
     * Đáp án: b
     */

    class Test {
        int x = 1;

        public void method(int x) {
            x += this.x;
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Test t = new Cau24().new Test();
        t.method(10);
    }
}
