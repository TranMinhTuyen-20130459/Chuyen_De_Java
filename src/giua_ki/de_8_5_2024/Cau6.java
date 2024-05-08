package giua_ki.de_8_5_2024;

public class Cau6 {

    static void testV1() {
        boolean bool = false;
        if (bool = true) {
            System.out.println("a");
        } else if (bool) {
            System.out.println("b");
        } else if (!bool) {
            System.out.println("c");
        } else {
            System.out.println("d");
        }
    }

    public static void main(String[] args) {
        testV1(); //=> a
    }
}
