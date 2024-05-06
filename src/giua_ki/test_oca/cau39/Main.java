package giua_ki.test_oca.cau39;

class MyBaseClass {
    public int i = 10;
    private int j = 20;
}

class MyClass extends MyBaseClass {
    private int i = 30; //1
    public int k = 40;
}

class MySubClass extends MyClass {
}

public class Main {
    public static void main(String args[]) {
        MySubClass c = new MySubClass();
        //System.out.println(c.i); //2
        //System.out.println(c.j); //3
        System.out.println(c.k); // Kết quả ra 40 nếu //2 và //3 bị comment
    }
}
