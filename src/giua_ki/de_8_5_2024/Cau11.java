package giua_ki.de_8_5_2024;

public class Cau11 {

    static void testV1() {
        int i = 1, j = -1;
        switch (i) {
            case 0, 1:
                j = 1;
            case 2:
                j = 2;
            default:
                j = 0;
        }
        System.out.println("j=" + j);
    }

    public static void main(String[] args) {
        testV1(); //=> j=0
    }
}
