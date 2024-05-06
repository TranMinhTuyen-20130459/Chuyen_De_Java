package giua_ki.test_oca.cau38;

public class Main {
    private int myValue = 0;

    public void showOne(int myValue) {
        myValue = myValue;
        // gán giá trị của tham số myValue cho chính tham số myValue
    }

    public void showTwo(int myValue) {
        this.myValue = myValue;
        // gán giá trị của tham số myValue cho biến myValue của đối tượng
    }

    public static void main(String[] args) {
        Main ct = new Main();
        ct.showTwo(200);
        System.out.println(ct.myValue); // 200
        ct.showOne(100);
        System.out.println(ct.myValue); // 200
        ct.showTwo(300);
        System.out.println(ct.myValue); // 300
    }
}
