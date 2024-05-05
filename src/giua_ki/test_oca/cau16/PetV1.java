//package giua_ki.test_oca.cau16;
//
//class Animal {
//    public Animal(int age) {
//        System.out.print("Animal");
//    }
//}
//
//public class Pet extends Animal {
//
//    public Pet() {
//        System.out.print("Pet"); //=> lỗi biên dịch vì không gọi constructor của lớp cha
//    }
//
//    public static void main(String[] args) {
//        new Animal(5);
//    }
///**
// * Đoạn mã không biên dịch được vì lớp Pet kế thừa từ lớp Animal nhưng không cung cấp một constructor phù hợp.
// * Trong lớp Animal, bạn đã định nghĩa một constructor yêu cầu một tham số kiểu int.
// * Khi một lớp kế thừa từ một lớp khác, nếu không có constructor nào được định nghĩa trong lớp con, thì constructor mặc định (không tham số) của lớp cha sẽ được gọi.
// * Tuy nhiên, trong trường hợp này, lớp Animal không có constructor mặc định nào, do đó bạn nhận được lỗi.
// * */
//}
