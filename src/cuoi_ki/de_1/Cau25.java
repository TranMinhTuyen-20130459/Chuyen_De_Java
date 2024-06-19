package cuoi_ki.de_1;

public class Cau25 {

    /**
     *  Cho đoạn chương trình sau:
     * 1. public class MyObj {
     * 2. public MyObj go(MyObj cb) {
     * 3. cb = null;
     * 4. return cb;
     * 5. }
     * 6. public static void main(String[] args) {
     * 7. MyObj c1 = new MyObj();
     * 8. MyObj c2 = new MyObj();
     * 9. MyObj c3 = c1.go(c2);
     * 10. }
     * 11. }
     * Có bao nhiêu đối tượng sẫn sàng cho quá trình gom rác sau dòng 9
     * b. 0
     * c. 1
     * d. 2
     * e. 3
     * f. Lỗi biên dịch
     *
     * Đáp án: b
     * */


    /**
     * Trong Java, quá trình gom rác (Garbage Collection) sẽ được bắt đầu tự động bởi Java Virtual Machine (JVM) khi nó nhận thấy bộ nhớ heap đang gần hết.
     * Bộ nhớ heap là nơi mà các đối tượng Java được lưu trữ.
     * Quá trình gom rác sẽ tìm kiếm và giải phóng bộ nhớ của các đối tượng mà không còn được tham chiếu đến từ bất kỳ phần nào của chương trình.
     * Điều này giúp giải phóng bộ nhớ và ngăn chặn tình trạng hết bộ nhớ (OutOfMemoryError).
     * Tuy nhiên, bạn không thể chắc chắn về thời điểm chính xác mà quá trình gom rác sẽ được thực hiện, vì nó phụ thuộc vào nhiều yếu tố như kích thước heap, số lượng đối tượng được tạo ra, và cách mà JVM được cấu hình.
     * Bạn cũng có thể yêu cầu JVM thực hiện quá trình gom rác bằng cách gọi phương thức `System.gc()`, nhưng việc gọi phương thức này chỉ là một gợi ý và JVM có thể chọn không thực hiện ngay lập tức.
     * */

    public static void main(String[] args) {

    }


}
