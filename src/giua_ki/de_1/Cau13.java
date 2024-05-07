package giua_ki.de_1;

public class Cau13 {

    private int a;

    public Cau13(int a) {
        this.a = a;
    }

    public void modify() {
        this.a++;
    }

    static void testV1() {
        int a = 10;
        Cau13 obj = new Cau13(a);
        obj.modify();
        System.out.println("a=" + a);
    }

    static void testV2() {
        int a = 10;
        Cau13 obj = new Cau13(a);
        obj.modify();
        System.out.println("a=" + obj.a);
    }

    public static void main(String[] args) {
        testV1();
        testV2();
    }
}
