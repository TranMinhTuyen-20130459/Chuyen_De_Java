package cuoi_ki.de_3;

public class Cau1 {

    /**
     * Cho đoạn chương trình sau:
     * String test = "1a2b3c4d5";
     * String[] tokens = test.split("c");
     * System.out.println(Arrays.toString(tokens));
     * Kết quả sẽ là gì?
     * a. [a, b, c, d]
     * b. [, 1, a, 2, b, 3, c, 4, d, 5]
     * c. [, a, b, c, d]
     * d. [1a2b3, 4d5]
     * <p>
     * Đáp án: d
     */

    static void testV1() {
        String test = "1a2b3c4d5";
        String[] tokens = test.split("c");
        System.out.println(java.util.Arrays.toString(tokens));
    }


    public static void main(String[] args) {
        testV1();
    }
}
