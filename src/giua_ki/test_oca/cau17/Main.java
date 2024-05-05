package giua_ki.test_oca.cau17;

public class Main {
    public static void main(String[] args) {
        double d = 12.3;
        MyClass dec = new MyClass();
        dec.decrement(d);
        System.out.println(d); //=> kết quả là 12.3
    }
    /**
     * Trong lớp MyClass, phương thức decrement nhận một tham số double và giảm giá trị của nó đi 1.0.
     * Tuy nhiên, do Java truyền tham số theo giá trị, nên thay đổi giá trị của decMe trong phương thức decrement không ảnh hưởng đến giá trị của d trong phương thức main.
     * Đó là lý do tại sao, sau khi gọi dec.decrement(d), giá trị của d vẫn là 12.3 khi in ra màn hình.
     * */
}

class MyClass {
    public void decrement(double decMe) {
        decMe = decMe - 1.0;
    }
}
