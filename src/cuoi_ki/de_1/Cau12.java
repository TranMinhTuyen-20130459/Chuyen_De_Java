package cuoi_ki.de_1;

public class Cau12 {

    interface A {
    }

    class B implements A {
    }

    class C extends B {
    }

    class D extends C {
    }

    public static void main(String[] args) {

        C x = new Cau12().new C();
        // B a = x;
        // A a = (D) x; => gây nên lỗi java.lang.ClassCastException bởi vì không thể ép kiểu từ lớp cha sang lớp con
        // A a = (B) x;
        // C a = (C) (B) x;

    }
}
