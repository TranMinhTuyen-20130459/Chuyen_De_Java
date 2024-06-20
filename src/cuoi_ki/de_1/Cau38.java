package cuoi_ki.de_1;

public class Cau38 {

    /**
     * Cho đoạn chương trình sau:
     * 1. class A{
     * 2. public void method(int...x){}
     * 3. public void method(int x){}
     * 4. }
     * 5. class B extends A{
     * 6. //insert code here
     * 7. }
     * Trong các phương thức sau, phương thức nào là không thêm được vào dòng 6?
     * a. public void method(int x){}
     * b. public void method(int x, int y){}
     * c. public int method(int x){}
     * d. public void method(String x){}
     *
     * Đáp án: c
     * Lý do:
     * Trong Java, khi một lớp con kế thừa từ một lớp cha, nó có thể ghi đè (override) các phương thức của lớp cha. Tuy nhiên, có một số quy tắc cần tuân thủ khi ghi đè phương thức:
     *
     * 1. Phương thức trong lớp con phải có cùng tên với phương thức trong lớp cha.
     * 2. Phương thức trong lớp con phải có cùng tham số với phương thức trong lớp cha.
     * 3. Phương thức trong lớp con phải có cùng kiểu trả về (hoặc kiểu con của kiểu trả về) với phương thức trong lớp cha.
     *
     * Trong trường hợp này, lớp `A` có hai phương thức `method()`. Một phương thức nhận một tham số kiểu `int`, và một phương thức nhận một số lượng tham số kiểu `int` không xác định (được biểu diễn bằng `int... x`).
     *
     * - Phương thức `public void method(int x){}` (lựa chọn a) có thể được thêm vào lớp `B` vì nó có cùng tên, cùng tham số và cùng kiểu trả về với một phương thức trong lớp `A`.
     * - Phương thức `public void method(int x, int y){}` (lựa chọn b) cũng có thể được thêm vào lớp `B` vì nó không trùng với bất kỳ phương thức nào trong lớp `A`.
     * - Phương thức `public int method(int x){}` (lựa chọn c) không thể được thêm vào lớp `B` vì nó có cùng tên và cùng tham số với một phương thức trong lớp `A` nhưng có kiểu trả về khác. Đây là lý do tại sao lựa chọn c là đáp án đúng.
     * - Phương thức `public void method(String x){}` (lựa chọn d) có thể được thêm vào lớp `B` vì nó không trùng với bất kỳ phương thức nào trong lớp `A`.
     *
     * Vì vậy, lựa chọn c là phương thức không thể thêm vào lớp `B` khi kế thừa từ lớp `A`.
     * */

}
