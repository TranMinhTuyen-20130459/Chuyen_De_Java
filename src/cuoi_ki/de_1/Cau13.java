package cuoi_ki.de_1;

public class Cau13 {

    private int a;

    public Cau13(int a) {
        this.a = a;
    }

    public void modify() {
        this.a++;
    }

    public static void main(String[] args) {
        int a = 10;
        Cau13 obj = new Cau13(a);
        obj.modify();
        System.out.println(a); // => Kết quả in ra 10
    }
}
