package cuoi_ki.de_1;

public class Cau10 {

    public enum MyEnum {
        A, B, C, D
    }

    static void testV1() {
        MyEnum myEnum = MyEnum.B;
        switch (myEnum) {
            case A:
                System.out.print("A ");
            default:
                System.out.print("B ");
            case C:
                System.out.print("C ");
            case D:
                System.out.print("D ");
        }
        // => Kết quả in ra B C D
    }

    static void testV2() {
        MyEnum myEnum = MyEnum.B;
        switch (myEnum) {
            default:
                System.out.print("B ");
            case A:
                System.out.print("A ");
            case C:
                System.out.print("C ");
            case D:
                System.out.print("D ");
        }
        // => Kết quả in ra B A C D
    }

    public static void main(String[] args) {
        testV1();
        System.out.println();
        testV2();
    }
}
