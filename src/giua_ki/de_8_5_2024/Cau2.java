package giua_ki.de_8_5_2024;

public class Cau2 {

    static void testV1() {
        int i = 1, j = 10;
        do {
            if (i > j) break;
            j--;
        } while (++i < 5);
        System.out.println("i=" + i + " and j=" + j);// Kết quả : i=5, j=6
    }

    static void testV2() {
        int i = 1, j = 10;
        do {
            if (i > j) break;
            j--;
        } while (i++ < 5);
        System.out.println("i=" + i + " and j=" + j);// Kết quả : i=6, j=5
    }

    public static void main(String[] args) {
        testV1();
        testV2();
    }
}
