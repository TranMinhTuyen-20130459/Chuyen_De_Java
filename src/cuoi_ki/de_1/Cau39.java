package cuoi_ki.de_1;

import java.util.PriorityQueue;

public class Cau39 {

    /**
     * Cho đoạn chương trình sau:
     * PriorityQueue<String> queue = new PriorityQueue<String>();
     * queue.add("f");
     * queue.add("b");
     * queue.add("a");
     * queue.add("d");
     * System.out.println(queue);
     * Kết quả sẽ là gì?
     * a. [a, b, d, f]
     * b. [a, d, b, f]
     * c. [a, b, f, d]
     * d. [f, d, b, a]
     * <p>
     * Đáp án: b
     * Lý do:
     * + PriorityQueue trong Java là một hàng đợi ưu tiên dựa trên heap.
     * + Khi thêm một phần tử vào PriorityQueue, nó sẽ được đặt vào vị trí phù hợp trong heap dựa trên ưu tiên của nó.
     * + Lưu ý rằng, mặc dù phần tử ở đầu hàng đợi luôn là phần tử có giá trị nhỏ nhất, thứ tự của các phần tử khác trong hàng đợi không được đảm bảo.
     * + Điều này có nghĩa là việc lặp qua PriorityQueue bằng một iterator không nhất thiết sẽ trả về các phần tử theo thứ tự tăng dần.
     */

    static void testV1() {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("f");
        queue.add("b");
        queue.add("a");
        queue.add("d");
        System.out.println(queue); //=> Kết quả in ra [a, d, b, f]
    }

    static void testV2() {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(5);
        queue.add(6);
        queue.add(9);
        queue.add(1);
        System.out.println(queue); //=> Kết quả in ra [1, 5, 9, 6]
    }

    public static void main(String[] args) {

        testV1();
        testV2();

    }

}
