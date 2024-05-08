package giua_ki.de_8_5_2024;

public class Cau4 {

    static void testV1(String s) {
        if (s == null | s.length() == 0) {
            System.out.println("Empty");
        } else System.out.println("Not Empty");
    }

    static void testV2(String s) {
        if (s == null || s.length() == 0) {
            System.out.println("Empty");
        } else System.out.println("Not Empty");
    }

    public static void main(String[] args) {
        // testV1(null); //=> Run-time error

        testV2(null); //=> Empty
    }
}
