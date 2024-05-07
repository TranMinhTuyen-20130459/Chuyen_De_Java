package giua_ki.de_1;

public class Cau9 {
    class Base {
        public Base() {
            System.out.print("Base");
        }
    }

    class Alpha extends Base {
        public Alpha() {
            System.out.print(" Alpha");
        }
    }

    public static void main(String[] args) {
        new Cau9().new Alpha(); // Kết quả in ra: BaseAlpha
    }
}
