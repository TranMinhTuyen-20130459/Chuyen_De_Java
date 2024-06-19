package cuoi_ki.de_1;

public class Cau30 {

    /**
     * Cho đoạn chương trình sau:
     * void waitForSignal() {
     * Object obj = new Object();
     * synchronized (Thread.currentThread()) {
     * obj.wait();
     * obj.notify();
     * }
     * }
     * Đoạn lệnh này cần ném ra lỗi nào sau đây?
     * a. NullPointerException
     * b. Interrupted Exception
     * c. IllegalStateception
     * d. Không cần ném ra lỗi gì hết
     * Đáp án: b
     */

    void waitForSignal() throws InterruptedException {
        Object obj = new Object();
        synchronized (Thread.currentThread()) {
            obj.wait();
            obj.notify();
        }
    }

    /**
     * Đáp án đúng là b. Interrupted Exception.
     *
     * Giải thích:
     * Trong Java, phương thức `wait()` được sử dụng để làm cho một thread chờ đợi cho đến khi một thread khác gọi phương thức `notify()` hoặc `notifyAll()` cho đối tượng này.
     * Phương thức này khiến thread hiện tại (gọi là T) đặt chính nó vào tập chờ đợi cho đối tượng này và sau đó từ bỏ mọi yêu cầu đồng bộ hóa trên đối tượng này.
     * Phương thức `wait()` nên được gọi trong một ngữ cảnh đồng bộ hóa, và nó giải phóng khóa trên đối tượng trong khi nó đợi. Sau khi phương thức `notify()` hoặc `notifyAll()` được gọi trên đối tượng, thread T trở nên có thể thực hiện cho mục đích lập lịch thread và có thể cạnh tranh theo cách thông thường với các thread khác để có quyền đồng bộ hóa trên đối tượng.
     * Phương thức `wait()` có thể ném ra một `InterruptedException` nếu bất kỳ thread nào đã ngắt thread hiện tại. Trạng thái bị ngắt của thread hiện tại được xóa khi ngoại lệ này được ném ra.
     * Trong mã của bạn, phương thức `wait()` được gọi mà không được bao quanh trong một khối try-catch để xử lý `InterruptedException` tiềm năng. Do đó, mã sẽ không biên dịch trừ khi `InterruptedException` được bắt hoặc được khai báo để ném ra.
     * */
}
