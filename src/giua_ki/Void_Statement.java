package giua_ki;

public class Void_Statement {

    /**
     * Câu 1: Hãy viết chương trình thực hiện các phép toán sau và giải thích kết quả:
     */
    public static void cau1(String s) {
        if (s == null | (s.length() == 0)) { // đây là phép toán so sánh bitwise
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }
    }

    /**
     * Câu 2: Hãy viết chương trình thực hiện các phép toán sau và giải thích kết quả:
     */
    public static void cau2(String s) {
        if (s == null || (s.length() == 0)) { // đây là phép toán so sánh logical
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }
    }

    /**
     * Câu 3: Hãy viết chương trình thực hiện các phép toán sau và giải thích kết quả:
     */
    public static void cau3() {
        Boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        if ((b1 & b2) | (b2 & b3) & b3) {
            System.out.println("Alpha");
        }
        if ((b1 = false) | (b1 & b3) | (b1 | b2)) {
            System.out.println("Beta");
        }
    }

    public static void main(String[] args) {
        // cau1(null);
        // cau2(null);
        // cau1("");
        cau3();
    }
}
