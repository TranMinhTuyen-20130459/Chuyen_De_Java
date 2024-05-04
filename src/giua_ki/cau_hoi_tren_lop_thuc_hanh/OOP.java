package giua_ki.cau_hoi_tren_lop_thuc_hanh;

import static giua_ki.cau_hoi_tren_lop_thuc_hanh.OOP.A.y;

public class OOP {

    class A {

        static int y = 2;

        public A(int x) {
            this();
            y *= 3;
        }

        public A() {
            y += 5;
        }
    }

    class Test extends A {

        /**
         * Từ khóa super được sử dụng để:
         * + Gọi hàm tạo của lớp cha
         * + Truy cập trực tiếp đến các thuộc tính và phương thức của lớp cha
         */

        public Test() {
            super(y); // Gọi hàm tạo của lớp cha
            y += 2;
        }
    }

    public static void main(String[] args) {
        var test = new OOP().new Test();
        System.out.println(y);
    }
}


