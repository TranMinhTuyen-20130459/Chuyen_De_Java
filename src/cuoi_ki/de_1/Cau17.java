package cuoi_ki.de_1;

public class Cau17 {

    class A {
        public byte getNumber() {
            return 1;
        }
    }

    class B extends A {
        public byte getNumber() {
            return 2;
        }
    }

    public static void main(String[] args) {
        B b = new Cau17().new B();
        System.out.println(b.getNumber()); // => Kết quả in ra 2
    }

}
