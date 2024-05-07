package giua_ki.de_1;

public class Cau7 {

    static void testV1() {
        boolean bool = false;
        if (bool = true)
            System.out.print("a");
        if (bool)
            System.out.print("b");
        if (!bool)
            System.out.print("c");
        System.out.println("d");
    }

    static void testV2() {
        boolean bool = true;
        if (bool = false)
            System.out.print("a");
        if (bool)
            System.out.print("b");
        if (!bool)
            System.out.print("c");
        System.out.println("d");
    }

    public static void main(String[] args) {
        testV1();
        testV2();
    }
}
