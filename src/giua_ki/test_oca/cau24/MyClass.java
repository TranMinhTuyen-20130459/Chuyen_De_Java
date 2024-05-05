package giua_ki.test_oca.cau24;

public class MyClass {

    static void testV1() {
        int myField = 10;
        final int red = 5; //=> phải khai báo biến red là hằng số mới sử dụng trong switch-case
        switch (myField) {
            default:
                System.out.print("Home");
                break;
            case red:
                System.out.print("Away");
        }
        /**
         * Trong Java, giá trị được sử dụng trong câu lệnh switch-case phải là một hằng số biểu diễn bởi một literal,
         * một biến final hoặc một biểu thức enum. Điều này đảm bảo rằng giá trị của các trường hợp không thay đổi trong quá trình thực thi chương trình.
         */
    }

    static void testV2() {
        int myField = 10;
        final int red = 10; //=> phải khai báo biến red là hằng số mới sử dụng trong switch-case
        switch (myField) {
            case red:
                System.out.print("Away");
            default:
                System.out.print("Home");
                break;
        }
        /**
         * Trong Java, giá trị được sử dụng trong câu lệnh switch-case phải là một hằng số biểu diễn bởi một literal,
         * một biến final hoặc một biểu thức enum. Điều này đảm bảo rằng giá trị của các trường hợp không thay đổi trong quá trình thực thi chương trình.
         */
    }

    public static void main(String[] args) {

        //testV1();
        testV2();
    }
}
