package cuoi_ki.de_1;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Cau36 {

    /**
     * Cho đoạn chương trình sau:
     * List<String> list = new LinkedList<String>();
     * list.add("aa");
     * list.add("Aa");
     * list.add("aA");
     * System.out.println(new TreeSet<String>(list));
     * Kết quả sẽ là gì?
     * a. [Aa, aA, aa]
     * b. [aa, aA, Aa]
     * c. [aA, aa, Aa]
     * d. Không xác định được
     *
     * Đáp án: a
     * Lý do:
     * + Trong Java, TreeSet là một cấu trúc dữ liệu dựa trên cây nhị phân tìm kiếm cân bằng.
     * + Nó tự động sắp xếp các phần tử theo thứ tự tăng dần.
     * + Khi sắp xếp các chuỗi, TreeSet sử dụng so sánh từ điển (lexical comparison), trong đó các ký tự viết hoa được coi là nhỏ hơn các ký tự viết thường.
     */

    static void testV1() {
        List<String> list = new LinkedList<String>();
        list.add("aa");
        list.add("Aa");
        list.add("aA");
        System.out.println(new TreeSet<String>(list));
    }

    public static void main(String[] args) {
        testV1();
    }

    /**
     * Trong Java, chuỗi được sắp xếp theo thứ tự từ điển (lexical order). Điều này có nghĩa là chuỗi được so sánh dựa trên giá trị Unicode của từng ký tự.
     * Thứ tự từ điển trong Java tuân theo các quy tắc sau:
     * 1. Các ký tự viết hoa đứng trước các ký tự viết thường. Ví dụ: "A" sẽ đứng trước "a" khi sắp xếp.
     * 2. Các ký tự số đứng trước các ký tự chữ. Ví dụ: "123" sẽ đứng trước "abc" khi sắp xếp.
     * 3. Các ký tự đặc biệt (như dấu chấm, dấu phẩy, dấu cách, v.v.) thường đứng trước cả ký tự số và ký tự chữ.
     * */
}
