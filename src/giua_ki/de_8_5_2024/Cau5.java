package giua_ki.de_8_5_2024;

public class Cau5 {

    static void testV1() {
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    break;
                case 1:
                    System.out.print("one ");
                case 2:
                    System.out.print("two ");
                case 3:
                    System.out.print("three ");
            }
        }
        System.out.println("done");
    }

    static void testV2() {
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    System.out.print("zero ");
                case 1:
                    System.out.print("one ");
                case 2:
                    System.out.print("two ");
                    break;
                case 3:
                    System.out.print("three ");
            }
        }
        System.out.println("done");
    }

    public static void main(String[] args) {

        testV1(); //=> kết quả: one two three two three done

        testV2();//=> kết quả: zero one two one two two done

    }
}
