package cuoi_ki.de_1;

public class Cau35 {

    /**
     * Cho đoạn chương trình sau:
     * 1. public class Test implements Runnable {
     * 2. public void run() {
     * 3. System.out.print(" running ");
     * 4. }
     * 5. public static void main(String[] args) throws Exception {
     * 6. Thread t = new Thread(new Test());
     * 7. System.out.print("begin");
     * 8. t.start();
     * 9. //insert code here
     * 10. System.out.print("end");
     * 11. }}
     * Bạn cần thêm đoạn lệnh nào sau đây vào dòng 9 để chương trình in ra
     * “begin running end”?
     * a. t.notify();
     * b. t.interrupt();
     * c. t.join();
     * d. t.wait();
     *
     * Đáp án: c
     * Lý do: Phương thức `join()` của lớp `Thread` được sử dụng để đảm bảo rằng thread hiện tại không tiếp tục thực thi cho đến khi thread mà nó tham gia hoàn thành việc thực thi của mình.
     * Trong trường hợp này, `t.join();` sẽ đảm bảo rằng thread `t` hoàn thành trước khi chương trình tiếp tục và in ra "end".
     * Các lựa chọn khác không đúng vì:
     * + `t.notify();` và `t.wait();` chỉ có thể được sử dụng trong một khối đồng bộ hóa (synchronized block) và chúng không đảm bảo thứ tự thực thi của các threads.
     * + `t.interrupt();` sẽ gửi yêu cầu dừng đến thread `t`, nhưng không đảm bảo rằng thread `t` sẽ hoàn thành trước khi "end" được in ra.
     */

    public class Test implements Runnable {
        public void run() {
            System.out.print(" running ");
        }
    }

    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Cau35().new Test());
        System.out.print("begin");
        t.start();
        t.join(); //insert code here
        System.out.print("end");
    }

}
