package giua_ki.de_8_5_2024;

public class Cau12 {

    static void testV1() {
        int count = 0;
        int x = 3;
        while (count++ < 3) {
            int y = (1 + 2 * count) % 3;
            switch (y) {
                default:
                case 0:
                    x -= 1;
                    break;
                case 1:
                    x += 5;
            }
        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        testV1();
    }
}
