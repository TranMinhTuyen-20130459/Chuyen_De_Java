package cuoi_ki.de_1;

import java.util.Arrays;
import java.util.List;

public class Cau40 {

    /**
     * Cho đoạn chương trình sau:
     * int[] array = {2,4,5};
     * List l = Arrays.asList(array);
     * System.out.println(l.size());
     * Kết quả sẽ là gì?
     * a. 0
     * b. 1
     * c. 2
     * d. 3
     * <p>
     * Đáp án: b
     * Lý do:
     * - Đáp án là b (1) vì phương thức `Arrays.asList(array)` không chuyển đổi mỗi phần tử của mảng thành một phần tử riêng biệt trong danh sách. Thay vào đó, nó coi toàn bộ mảng như là một phần tử duy nhất và thêm nó vào danh sách.
     * - Do đó, `l.size()` sẽ trả về 1, bởi vì danh sách `l` chỉ chứa một phần tử duy nhất, đó là mảng `array`.
     * - Nếu bạn muốn mỗi phần tử của mảng trở thành một phần tử riêng biệt trong danh sách, bạn nên sử dụng một mảng kiểu đối tượng, chẳng hạn như `Integer[]` thay vì `int[]`.
     */

    static void testV1() {
        int[] array = {2, 4, 5};
        List l = Arrays.asList(array);
        System.out.println(l.size()); //=> Kết quả in ra 1
    }

    static void testV2() {
        Integer[] array = {2, 4, 5};
        List l = Arrays.asList(array);
        System.out.println(l.size()); //=> Kết quả in ra 3
    }

    public static void main(String[] args) {
        testV1();
        testV2();
    }

    /**
     * Trong Java, có tám kiểu dữ liệu nguyên thủy:
     * 1. `byte`: Kiểu số nguyên, chiếm 1 byte bộ nhớ, có giá trị từ -128 đến 127.
     * 2. `short`: Kiểu số nguyên, chiếm 2 byte bộ nhớ, có giá trị từ -32,768 đến 32,767.
     * 3. `int`: Kiểu số nguyên, chiếm 4 byte bộ nhớ, có giá trị từ -2,147,483,648 đến 2,147,483,647.
     * 4. `long`: Kiểu số nguyên, chiếm 8 byte bộ nhớ, có giá trị từ -9,223,372,036,854,775,808 đến 9,223,372,036,854,775,807.
     * 5. `float`: Kiểu số thực, chiếm 4 byte bộ nhớ, có giá trị từ 1.4e-45 đến 3.4e+38.
     * 6. `double`: Kiểu số thực, chiếm 8 byte bộ nhớ, có giá trị từ 4.9e-324 đến 1.8e+308.
     * 7. `char`: Kiểu ký tự, chiếm 2 byte bộ nhớ, có giá trị từ 0 đến 65,535.
     * 8. `boolean`: Kiểu logic, không xác định kích thước cụ thể, chỉ có hai giá trị là `true` hoặc `false`.
     * */
}
