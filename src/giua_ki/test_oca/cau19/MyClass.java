package giua_ki.test_oca.cau19;

public class MyClass {
    public static void main(String[] info) {
        int myField = 15;
        if (myField >= 15 && myField < 37) {
            System.out.print("Not enough");
        }
        if (myField == 37) {
            System.out.print("Just right");
        } else {
            System.out.print("Too many");
        }
        //=> Kết quả in ra: Not enoughToo many
    }
}
