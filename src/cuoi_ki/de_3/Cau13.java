package cuoi_ki.de_3;

public class Cau13 {

    /**
     * Cho đoạn chương trình sau:
     * 1. interface A{}
     * 2. class B implements A{}
     * 3. class C extends B{}
     * 4. public class D extends C{
     * 5. public static void main(String[] args) {
     * 6. C x = new C();
     * 7. //insert code here
     * 8. }}
     * <p>
     * Lựa chọn nào sau đây là hợp lệ khi muốn thêm vào dòng 7
     * a. A a = (B)x;
     * b. A a = (D) x;
     * c. A a = x;
     * d. C a = (C)(B)x;
     *
     * =>> Đáp án c
     */

    interface A {
    }

    class B implements A {
    }

    class C extends B {
    }

    public class D extends C {

    }

    public static void main(String[] args) {
        C x = new Cau13().new C();
        A a = x; //insert code here
    }
}
