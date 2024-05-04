package giua_ki.test_oca.cau3;

public class Cau3 {

    /**
     * Câu hỏi: Kết quả của đoạn code sau là gì?
     */
    static void testV1() {
        boolean b1 = false;
        int i1 = 2;
        int i2 = 3;
        // Phép so sánh i1==i2 sẽ được thực hiện trước, sau đó kết quả của phép so sánh sẽ được gán cho b1.
        if (b1 = i1 == i2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /**
     * Câu hỏi: Kết quả của đoạn code sau là gì?
     */
    static void testV2() {
        boolean b1 = false;
        int i1 = 2;
        int i2 = 3;
        // Phép so sánh (i1==i2) sẽ được thực hiện trước, sau đó kết quả của phép so sánh sẽ được so sánh tiếp với b1.
        if (b1 == (i1 == i2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /**
     * hãy * Câu hỏi: Kết quả của đoạn code sau là gì?
     */
      /*  static void testV3() {
            boolean b1 = false;
            int i1 = 2;
            int i2 = 3;
            // Phép gán i1 cho b1 sẽ được thực hiện trước,
            // sau đó kết quả của phép gán sẽ được so sánh với i2.
            // nhưng b1 là boolean, i1 là int nên không thể gán i1 cho b1 => lỗi biên dịch
            if ((b1 = i1) == i2){
                System.out.println("true");
            } else{
                System.out.println("false");
            }
        }*/
    public static void main(String[] args) {
        testV1();
        testV2();

        /**
         - Trong Java, thứ tự thực hiện các phép toán được xác định bởi các quy tắc ưu tiên toán tử. Dưới đây là thứ tự từ cao đến thấp:
         1.Dấu ngoặc đơn ()
         2.Phép toán một ngôi: ++, --, !, ~
         3.Phép nhân, chia, và modulo: *, /, %
         4.Phép cộng và trừ: +, -
         5.Phép dịch bit: <<, >>, >>>
         6.Phép so sánh: <, >, <=, >=, instanceof
         7.Phép so sánh bằng và không bằng: ==, !=
         8.Phép AND bit: &
         9.Phép XOR bit: ^
         10.Phép OR bit: |
         11.Phép AND logic: &&
         12.Phép OR logic: ||
         13.Phép gán và các biến thể của nó: =, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=
         */
    }
}
