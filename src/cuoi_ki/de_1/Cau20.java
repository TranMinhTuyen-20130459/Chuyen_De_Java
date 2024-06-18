package cuoi_ki.de_1;

public class Cau20 {

    class Outer {

        public static class Inner {

        }

    }

    public class Test {
        Outer.Inner in = new Outer.Inner();
    }

    /**
     * Cho đoạn chương trình sau:
     * 1. class Outer{
     * 2. public static class Inner{}
     * 3. }
     * 4. public class Test{
     * 5. //insert code here
     * 6. }
     *
     * Lựa chọn nào sau đây là đúng khi muốn tạo một đối tượng thuộc lớp
     * Inner ở dòng thứ 5
     * A. Inner in = new Inner();
     * B. Outer.Inner in = new Outer.Inner();
     * C. Outer out = new Outer(); out.Inner = new out.Inner();
     * D. Ở dòng 5 không thể tạo ra một đối tượng thuộc lớp Inner
     *
     * =>> B. Outer.Inner in = new Outer.Inner();
     * */
}
