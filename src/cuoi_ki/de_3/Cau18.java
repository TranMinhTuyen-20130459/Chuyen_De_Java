package cuoi_ki.de_3;

import java.util.Set;
import java.util.TreeSet;

public class Cau18 {

    /**
     * Cho đoạn chương trình sau:
     * import java.util.*;
     * public class B implements Comparable<B> {
     * private String maSV;
     * public B(String mSSV) { maSV = mSSV; }
     * public int compareTo(B o) { return 0; }
     * public static void main(String[] args) {
     * B sv1 = new B("123");
     * B sv2 = new B("123");
     * Set<B> s = new TreeSet<B>();
     * s.add(sv1);
     * s.add(sv2);
     * System.out.println(s.size());
     * }}
     * Kết quả sẽ là gì?
     * a. Lỗi biên dịch
     * b. Một ngoại lệ được ném ra
     * c. 1
     * d. 2
     * <p>
     * =>> Đáp án là c
     */

    public class B implements Comparable<B> {
        private String maSV;

        public B(String mSSV) {
            maSV = mSSV;
        }

        public int compareTo(B o) {
            return 0;
        }

    }

    public static void main(String[] args) {
        B sv1 = new Cau18().new B("123");
        B sv2 = new Cau18().new B("123");
        Set<B> s = new TreeSet<B>();
        s.add(sv1);
        s.add(sv2);
        System.out.println(s.size());
    }
    /**
     * Đoạn chương trình này tạo một lớp `B` thực hiện giao diện `Comparable<B>`.
     * Lớp này có một thuộc tính `maSV` kiểu `String` và một phương thức `compareTo(B o)` trả về `0` cho mọi đối tượng `B` so sánh với nó. Điều này có nghĩa là tất cả các đối tượng `B` đều được coi là bằng nhau khi so sánh.
     * Trong phương thức `main`, chúng ta tạo hai đối tượng `B` với cùng một giá trị cho `maSV` là `"123"`. Chúng ta sau đó thêm cả hai đối tượng này vào một `TreeSet<B>`. `TreeSet` là một tập hợp mà không chứa các phần tử trùng lặp (dựa trên phương thức `compareTo` của `Comparable`).
     * Tuy nhiên, do phương thức `compareTo` của chúng ta luôn trả về `0`, `TreeSet` coi cả hai đối tượng `B` là giống nhau, dù chúng ta đã tạo chúng như là hai đối tượng riêng biệt. Do đó, chỉ có một đối tượng `B` được thêm vào `TreeSet`.
     * Cuối cùng, chúng ta in ra kích thước của `TreeSet` bằng phương thức `size()`. Kết quả sẽ là `1` vì chỉ có một đối tượng `B` trong `TreeSet`.
     * */

}
