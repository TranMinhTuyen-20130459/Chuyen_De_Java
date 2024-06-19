package cuoi_ki.de_1;

public class Cau32 {

    /**
     * Cho đoạn chương trình sau:
     * 1. public class MyClass {
     * 2. private int i;
     * 3. // insert code here
     * 4. public MyClass(int i) {
     * 5. this.i = i;
     * 6. }
     * 7. }
     * 8. class MyOtherClass extends MyClass {//lỗi
     * 9. }
     * Bạn cần thêm dòng lệnh nào sau đây vào dòng 3 để dòng 8 hết lỗi?
     * a. public MyClass() {this(1); }
     * b. public MyClass() {MyClass(1); }
     * c. public MyClass() { MyOtherClass (); }
     * d. public MyOtherClass () { MyClass (); }
     * e. public MyClass() { MyOtherClass (1); }
     * <p>
     * Đáp án: a
     */

    public class MyClass {
        private int i;

        public MyClass() {
            this(1);
        }

        public MyClass(int i) {
            this.i = i;
        }
    }

    class MyOtherClass extends MyClass {

    }

    public static void main(String[] args) {

    }


}
