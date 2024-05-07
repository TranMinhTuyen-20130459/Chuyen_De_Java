package giua_ki.de_1;

public class Cau2 {

    static void testV1() {
        int i = 0, j = 5;
        do {
            if (++i < j--) continue;
        } while (i < 5);
        System.out.println("i= " + i + " and j=" + j); //=> Kết quả in ra i=5 và j=0
    }

    static void testV2() {
        int i = 0, j = 5;
        do {
            if (++i < --j) continue;
        } while (i < 5);
        System.out.println("i= " + i + " and j=" + j); //=> Kết quả in ra i=5 và j=0
    }

    public static void main(String[] args) {
        testV1();
        testV2();
    }
}
