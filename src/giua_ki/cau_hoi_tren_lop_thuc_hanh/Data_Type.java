package giua_ki.cau_hoi_tren_lop_thuc_hanh;

public class Data_Type {

      /*  static void cau1() {
            float f1[], f2[];
            f1 = new float[]{20, 1.4, 4.2}; // Error compile
            f2 = f1;
            System.out.println(f2[1]);
        }*/

    /**
     * Câu 2: Hãy viết chương trình thực hiện các phép toán sau và giải thích kết quả:
     */
    static void cau2() {
        float f1[], f2[];
        f1 = new float[]{20, 1.4f, 4.2f};
        f2 = f1;
        System.out.println(f2[1]);
    }

    /**
     * Câu 3: Hãy viết chương trình thực hiện các phép toán sau và giải thích kết quả:
     */
    static void cau3() {
        double f1[], f2[];
        f1 = new double[]{20, 1.4, 4.2};
        f2 = f1;
        System.out.println(f2[1]);
    }

    public static void main(String[] args) {
        cau2();
        cau3();
    }
}
