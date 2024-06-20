package cuoi_ki.de_3;

public class Cau7 {

    /**
     * Cho đoạn chương trình sau:
     * boolean bool = true;
     * if (bool = false)
     * System.out.print("c ");
     * if (bool)
     * System.out.print("b ");
     * if (!bool) System.out.print("a ");
     * System.out.print("d ");
     * Chương trình sẽ in ra lựa chọn nào sau đây?
     * a. c d
     * b. a d
     * c. a c d
     * d. a b d
     * <p>
     * Đáp án : b
     */


    static void testV1() {
        boolean bool = true;
        if (bool = false)
            System.out.print("c ");
        if (bool)
            System.out.println("b ");
        if (!bool)
            System.out.print("a ");

        System.out.print("d ");
    }

    public static void main(String[] args) {
        testV1();
    }
}
