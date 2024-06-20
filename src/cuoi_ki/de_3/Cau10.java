package cuoi_ki.de_3;

public class Cau10 {

    /**
     * Cho trước đoạn chương trình sau:
     * public class Test {
     * private static int x = getValue();
     * private static final int y = 5;
     * private static int getValue(){
     * return y; }
     * public static void main(String[] args) {
     * System.out.println(x);
     * }}
     * Kết quả sẽ là gì khi biên dịch và chạy chương trình?
     * a. Xuất ra 0
     * b. Lỗi khi chạy
     * c. Lỗi cú pháp (Syntax error)
     * d. Xuất ra 5
     * <p>
     * Đáp án: d
     */

    private static int x = getValue();
    private static final int y = 5;

    private static int getValue() {
        return y;
    }

    public static void main(String[] args) {
        System.out.println(x);
    }
}
