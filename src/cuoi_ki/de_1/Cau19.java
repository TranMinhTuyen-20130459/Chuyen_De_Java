package cuoi_ki.de_1;

public class Cau19 {

    public static void method1() {
        // method2();// => Không thể gọi method2() ở đây vì method2() không phải là static method
    }

    public void method2() {
        // method1(); // => Gọi method1() ở đây không gây ra lỗi
    }

    public static void main(String[] args) {

    }
}
