package giua_ki.de_1;

public class Cau14 {

    class A {
        static int y = 2;

        public A(int x) {
            this();
            y *= 3;
        }

        public A() {
            y++;
        }
    }

    public class B extends A {

        public B() {
            super(y);
            y += 2;
        }

        public static void main(String[] args) {
            new Cau14().new B();
            System.out.println("y=" + y); // Kết quả ra y = 11
        }
    }

    public static void main(String[] args) {
        B.main(args);
    }
}
