package giua_ki.test_oca.cau31;

public class Cau31 {

    static void testV1() {
        for (int i = 0; i < 10; ) {
            i = i++;// i++ trả về giá trị cũ của i trước khi tăng i lên 1
            System.out.println("Hello World");
            //=> Kết quả: lặp vô hạn
        }
    }

    static void testV2() {
        for (int i = 0; i < 10; ) {
            i = ++i; // ++i trả về giá trị mới của i sau khi tăng i lên 1
            System.out.println("Hello World");
            //=> Kết quả: lặp 10 lần
        }
    }

    public static void main(String[] args) {
        //  testV1();
        testV2();
    }
}
