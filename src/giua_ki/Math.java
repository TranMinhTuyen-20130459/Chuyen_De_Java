package giua_ki;

public class Math {

    /**
     * Câu 1: Hãy viết chương trình thực hiện các phép toán sau và giải thích kết quả:
     */
    static void cau1() {
        int a = 10;
        int b = 3;
        int c = a / b; // phép chia lấy phần nguyên
        System.out.println("c = " + c);
        double d = a / b; // phép chia lấy phần nguyên sau đó ép kiểu về double
        System.out.println("d = " + d);
        d = (float) a / b; // ép kiểu a về float sau đó chia cho b
        System.out.println("d = " + d);
        d = (double) a / b; // ép kiểu a về double sau đó chia cho b
        System.out.println("d = " + d);
        d = (float) (a / b); // phép chia lấy phần nguyên sau đó ép kiểu về float
        System.out.println("d = " + d);
    }

    static void cau2() {
        int m = 7;
        int n = 7;
        int a = 2 * ++m;
        System.out.println("a = " + a);
        int b = 2 * n++;
        System.out.println("b = " + b);
    }

    static void cau3() {
        /**
         * Phép toán % trả về số dư của phép chia.
         * Dấu của kết quả sẽ giống dấu của số bị chia (số được chia).
         * */
        int x = -8 % 5;
        System.out.println("x = " + x);
    }

    static void cau4() {
        /**
         * Phép toán % trả về số dư của phép chia.
         * Dấu của kết quả sẽ giống dấu của số bị chia (số được chia).
         * */
        int x = 7 % -4;
        System.out.println("x = " + x);
    }

    public static void main(String[] args) {
        // cau1();
        // cau2();
        // cau3();
        cau4();
    }
}
