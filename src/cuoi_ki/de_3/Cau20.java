package cuoi_ki.de_3;

public class Cau20 {

    /**
     * Cho đoạn chương trình sau:
     * interface A{
     * public void method1();
     * public void method2();
     * }
     * <p>
     * abstract class B implements A{
     * public abstract void method3();
     * public void method2(){};
     * }
     * <p>
     * class C extends B{
     * //code here
     * }
     * <p>
     * Class C cần phải override tối thiểu bao nhiêu phương thức để đoạn code
     * trên không có lỗi?
     * a. 3
     * b. 2
     * c. 1
     * d. 0
     * <p>
     * =>> Đáp án là a
     */

    interface A {
        public void method1();

        public void method2();
    }

    abstract class B implements A {
        public abstract void method3();

        public void method2() {};
    }

    class C extends B {

        @Override
        public void method1() {

        }

        @Override
        public void method3() {

        }

    }


    public static void main(String[] args) {

    }

}
