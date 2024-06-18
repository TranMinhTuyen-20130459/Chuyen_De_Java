package cuoi_ki.de_1;

public class Cau7 {

    static void testV1() {

        boolean bool = false;
        if (bool = true) System.out.print("a ");
        if (bool) System.out.print("b ");
        if (!bool) System.out.print("c ");
        System.out.print("d"); // => Kết quả in ra a b d

    }

    static void testV2() {

        boolean bool = false;
        if (bool == true) System.out.print("a ");
        if (bool) System.out.print("b ");
        if (!bool) System.out.print("c ");
        System.out.print("d"); // => Kết quả in ra c d

    }

    public static void main(String[] args) {
        testV1();
        System.out.println();
        testV2();
    }
}
