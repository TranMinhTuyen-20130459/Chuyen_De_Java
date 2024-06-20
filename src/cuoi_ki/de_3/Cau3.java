package cuoi_ki.de_3;

public class Cau3 {

    /**
     * . Cho đoạn chương trình sau:
     * 1. public class MyClass {
     * 2. private String i;
     * 3. // insert code here
     * 4. public MyClass(String i) {
     * 5. this.i = i;
     * 6. }}
     * 7. class MyOtherClass extends MyClass {//lỗi
     * 8. }
     * Bạn cần thêm dòng lệnh nào sau đây vào dòng 3 để dòng 7 hết lỗi?
     * a. public MyClass() {MyClass(1); }
     * b. public MyClass() { MyOtherClass (); }
     * c. public MyClass() {this(1); }
     * d. public MyClass() { MyOtherClass (1); }
     * e. public MyClass() { this (“1”); }
     *
     * Đáp án: e
     * */

    /**
     * Đoạn mã này đang gặp lỗi vì lớp `MyOtherClass` đang cố gắng kế thừa từ lớp `MyClass` mà không có một constructor không tham số.
     * Trong Java, khi một lớp con kế thừa từ một lớp cha, nếu lớp con không tự định nghĩa bất kỳ constructor nào, Java sẽ tự động cung cấp một constructor không tham số cho lớp con và constructor này sẽ gọi đến constructor không tham số của lớp cha.
     * Nếu lớp cha không có constructor không tham số, bạn sẽ nhận được lỗi biên dịch.
     *
     * Trong trường hợp này, lớp `MyClass` chỉ có một constructor với một tham số kiểu `String`. Do đó, để khắc phục lỗi này, bạn cần thêm một constructor không tham số vào lớp `MyClass`.
     * */


}
