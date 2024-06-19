package cuoi_ki.de_1;

import java.util.Arrays;

public class Cau31 {

    /**
     * Cho đoạn chương trình sau:
     * 1. Object[] array = { new Double(1.0), new Object(), new
     * Boolean(false)};
     * 2. System.out.println(Arrays.binarySearch(array, new Double(1)));
     * Kết quả sẽ là gì?
     * a. In ra 0
     * b. Lỗi ở dòng 1
     * c. Lỗi ở dòng 2
     * d. ClassCastException
     *
     * Đáp án: d
     */

    public static void main(String[] args) {
        Object[] array = {new Double(1.0), new Object(), new Boolean(false)};
        System.out.println(Arrays.binarySearch(array, new Double(1)));
    }

}
