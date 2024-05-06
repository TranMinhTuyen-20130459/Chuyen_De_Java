package giua_ki.test_oca.cau38;

public class Main2 {

    private int myValue = 0;

    public void showOne(int myValue) {
        myValue = myValue;
    }

    public void showTwo(int myValue) {
        this.myValue = myValue;
    }

    public static void main(String[] args) {
        Main2 ct = new Main2();
        ct.showOne(100);
        System.out.println(ct.myValue); // 0
        ct.showTwo(200);
        System.out.println(ct.myValue); // 200
    }
}
