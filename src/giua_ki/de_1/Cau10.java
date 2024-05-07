package giua_ki.de_1;

public class Cau10 {

    public enum MyEnum {
        A, B, C, D
    }

    static void testV1() {
        MyEnum myEnum = MyEnum.B;
        switch (myEnum) {
            case A:
                System.out.print("A");
            default:
                System.out.print("B");
            case C:
                System.out.print("C");
            case D:
                System.out.print("D");
        }
        // Kết quả in ra: BCD
    }

    static void testV2() {
        MyEnum myEnum = MyEnum.B;
        switch (myEnum) {
            case A:
                System.out.print("A");
            case B:
                System.out.print("B");
            case C:
                System.out.print("C");
                break;
            case D:
                System.out.print("D");
        }
        // Kết quả in ra: BC
    }

    static void testV3() {
        MyEnum myEnum = MyEnum.B;
        switch (myEnum) {
            default:
                System.out.print("Default");
            case A:
                System.out.print("A");
            case B:
                System.out.print("B");
            case C:
                System.out.print("C");
                break;
            case D:
                System.out.print("D");
        }
        /**
         * Kết quả in ra : BC
         * Trong trường hợp này, default được đặt trước case B.
         * Tuy nhiên, default chỉ được thực thi khi không có case nào khớp với giá trị của biến.
         * Do đó, default sẽ không được thực thi trong trường hợp này.
         * */
    }

    public static void main(String[] args) {
        testV1();
        System.out.println("");
        testV2();
        System.out.println("");
        testV3();
    }
}
