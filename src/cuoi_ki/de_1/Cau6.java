package cuoi_ki.de_1;

public class Cau6 {

    interface A {
        public void method1();

        public void method2();
    }

    abstract class B implements A {
        public abstract void method1();
    }

    class C extends B {
        @Override
        public void method2() {

        }

        @Override
        public void method1() {

        }
    }

    /**
     * Class C cần phải override tối thiểu bao nhiêu phương thức để đoạn code
     * trên không có lỗi?
     * A. 0
     * B. 1
     * C. 2
     * D. 3
     *
     * =>> Đáp án là C vì class C cần phải override tất cả các phương thức abstract và phương thức của interface mà nó implement.
     * */

    /**
     * Trong Java, khi một lớp trừu tượng triển khai một interface, nó không cần phải cung cấp cài đặt cho tất cả các phương thức của interface đó.
     * Thay vào đó, nó có thể để các phương thức đó không được cài đặt (vẫn giữ trạng thái trừu tượng) và bắt các lớp con cung cấp cài đặt cho chúng.
     * Trong trường hợp của bạn, class B là một lớp trừu tượng triển khai interface A nhưng chỉ cung cấp khai báo trừu tượng cho method1(). method2() không được cài đặt trong class B và do đó, nó vẫn là một phương thức trừu tượng.
     * Khi class C kế thừa class B, nó phải cung cấp cài đặt cho cả method1() và method2().
     * */
}
