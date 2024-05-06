package giua_ki.cau_hoi_tren_lop_thuc_hanh.oop;

public class SwapNumber {

    public void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
    }

    public void swap(Integer a1, Integer b1) {
        Integer c = a1;
        a1 = b1;
        b1 = c;
    }

    public void testV1() {
        int a = 1, b = 2;
        System.out.println("Before swap a:" + a + " ,b: " + b);
        swap(a, b);
        System.out.println("After swap a:" + a + " ,b: " + b);
    }

    public void testV2() {
        Integer a = new Integer(1), b = new Integer(2);
        System.out.println("Before swap a:" + a + " ,b: " + b);
        swap(a, b);
        System.out.println("After swap a:" + a + " ,b: " + b);
    }

    public static void main(String[] args) {
        SwapNumber swapNumber = new SwapNumber();
        swapNumber.testV1();
        System.out.println("--------------------");
        swapNumber.testV2();
    }
}
