package giua_ki.de_8_5_2024;

public class Cau10 {

    static void testV1() {
        if ("String ".trim() == "String") {
            System.out.println("Equal");
        } else System.out.println("Not Equal");
    }

    static void testV2() {
        if ("String ".trim().equals("String")) {
            System.out.println("Equal");
        } else System.out.println("Not Equal");
    }

    public static void main(String[] args) {

        testV1(); //=> Not Equal
        testV2(); //=> Equal

        /**
         * Hàm trim() trong Java được sử dụng để loại bỏ các khoảng trắng ở đầu và cuối chuỗi.
         * Hàm testV1() sử dụng toán tử == để so sánh hai chuỗi. Trong Java, toán tử == so sánh hai tham chiếu, không phải nội dung của chuỗi. Do đó, kết quả in ra là "Not Equal" vì hai chuỗi này là hai đối tượng khác nhau trong bộ nhớ.
         * Hàm testV2() sử dụng phương thức equals() để so sánh hai chuỗi. Phương thức equals() trong Java so sánh nội dung của hai chuỗi. Do đó, kết quả in ra là "Equal" vì sau khi loại bỏ khoảng trắng, nội dung của hai chuỗi này giống nhau.
         * */
    }
}
