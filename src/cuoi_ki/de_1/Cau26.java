package cuoi_ki.de_1;

public class Cau26 {

    /**
     * Cho đoạn chương trình sau:
     * String test = "1a2b3c4d5";
     * String[] tokens = test.split("\\d"); //d cắt chuỗi theo chữ số
     * System.out.println(Arrays.toString(tokens));
     * Kết quả sẽ là gì?
     * a. [1a2b3c4d5]
     * b. [a, b, c, d]
     * c. [, a, b, c, d]
     * d. [, a, b, c, d, ]
     * e. [, 1, a, 2, b, 3, c, 4, d, 5]
     *
     * Đáp án: c
     */

    public static void main(String[] args) {
        String test = "1a2b3c4d5";
        String[] tokens = test.split("\\d"); //d cắt chuỗi theo chữ số
        System.out.println(java.util.Arrays.toString(tokens));
    }

    /**
     * Đoạn chương trình này sử dụng phương thức `split()` của lớp `String` trong Java để tách chuỗi `test` thành một mảng các chuỗi con.
     * Phương thức `split()` nhận vào một biểu thức chính quy (regex) làm tham số và sẽ tách chuỗi gốc tại những chỗ mà biểu thức chính quy này khớp.
     * Trong trường hợp này, biểu thức chính quy là `"\\d"`, nghĩa là bất kỳ chữ số nào từ 0 đến 9. Do đó, chuỗi `test` sẽ được tách tại mỗi chữ số.
     * Kết quả là một mảng các chuỗi con, mỗi chuỗi con là một phần của chuỗi gốc nằm giữa hai chữ số liên tiếp.
     * Vì chuỗi `test` bắt đầu bằng một chữ số, nên phần tử đầu tiên của mảng kết quả sẽ là một chuỗi rỗng (do không có phần tử nào của chuỗi gốc nằm trước chữ số đầu tiên).
     * Sau đó, mỗi chữ cái trong chuỗi `test` sẽ tạo thành một phần tử riêng biệt trong mảng kết quả, vì mỗi chữ cái đều nằm giữa hai chữ số.
     * Do đó, mảng kết quả sẽ là `[, a, b, c, d]`, tương ứng với đáp án c.
     * */

    /**
     * Có, khi làm việc với biểu thức chính quy (regex) trong Java, có một số quy tắc cần nhớ:
     * 1. `\\d`: Khớp với bất kỳ chữ số nào từ 0 đến 9.
     * 2. `\\D`: Khớp với bất kỳ ký tự không phải chữ số nào.
     * 3. `\\s`: Khớp với bất kỳ ký tự khoảng trắng nào (khoảng trắng, tab, xuống dòng, vv).
     * 4. `\\S`: Khớp với bất kỳ ký tự không phải khoảng trắng nào.
     * 5. `\\w`: Khớp với bất kỳ ký tự từ a-z, A-Z, 0-9 hoặc _.
     * 6. `\\W`: Khớp với bất kỳ ký tự không phải từ a-z, A-Z, 0-9 hoặc _.
     * Ngoài ra, bạn cũng có thể sử dụng các ký tự đặc biệt khác như `*`, `+`, `?`, `{}`, `[]`, `()` để tạo ra các biểu thức chính quy phức tạp hơn.
     * */
}
