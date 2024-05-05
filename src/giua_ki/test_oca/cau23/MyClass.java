package giua_ki.test_oca.cau23;

public class MyClass {

    public static void main(String[] args) {
        String bob = new String("bob");
        String notBob = bob;
        System.out.println((bob == notBob) + " " + (bob.equals(notBob)));
        //=> Kết quả in ra: true true
    }
}
