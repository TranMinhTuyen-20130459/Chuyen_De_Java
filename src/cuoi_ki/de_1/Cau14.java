package cuoi_ki.de_1;

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

    class B extends A {

        public B() {
            super(y);
            y += 2;
        }
    }


    public static void main(String[] args) {
        new Cau14().new B();
        System.out.println(A.y); // => Kết quả in ra 11
    }
}
