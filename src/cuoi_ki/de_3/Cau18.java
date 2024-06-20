package cuoi_ki.de_3;

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
     * */
}
