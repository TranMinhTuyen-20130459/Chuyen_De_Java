package giua_ki.test_oca.cau4;

public class Cau4 {

    /**
     * Câu hỏi: Kết quả của đoạn code sau là gì?
     */
    static void testV1() {
        String s = new String("5");
        System.out.println(1 + 10 + s + 1 + 10);

        /**
         * //=> kết quả là 115110
         * Giải thích:
         * Trong biểu thức 1 + 10 + s + 1 + 10:
         * Đầu tiên, 1 + 10 được thực hiện, tạo ra số 11.
         * Sau đó, số 11 được nối với chuỗi "5", tạo ra chuỗi "115".
         * Tiếp theo, chuỗi "115" được nối với số 1, tạo ra chuỗi "1151".
         * Cuối cùng, chuỗi "1151" được nối với số 10, tạo ra chuỗi "115110".
         * Đây là chuỗi được in ra bởi System.out.println.
         * */
    }

    public static void main(String[] args) {
        testV1();
    }
}
