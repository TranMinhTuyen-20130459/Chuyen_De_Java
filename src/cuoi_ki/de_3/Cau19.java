package cuoi_ki.de_3;

public class Cau19 {

    /**
     * Cho đoạn chương trình sau:
     * Object[] array = { new Double(1.0), new Double(5.0), new
     * Double(7.0) };
     * System.out.println(Arrays.binarySearch(array, new Double(5)));
     * <p>
     * Kết quả sẽ là gì?
     * a. In ra 2
     * b. Ném lỗi ClassCastException
     * c. In ra 0
     * d. In ra 1
     * <p>
     * =>> Đáp án là b
     */

    static void testV1() {
        Object[] array = {new Double(1.0), new Double(5.0), new Double(7.0)};
        System.out.println(java.util.Arrays.binarySearch(array, new Double(5)));
    }

    public static void main(String[] args) {
        testV1();
    }
}
