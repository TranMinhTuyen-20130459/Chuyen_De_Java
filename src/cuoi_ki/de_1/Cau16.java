package cuoi_ki.de_1;

public class Cau16 {

    static void add3(Integer i) {
        int val = i.intValue();
        val += 3;
        i = new Integer(val);
    }

    public static void main(String[] args) {
        int i = 0;
        add3(i);
        System.out.println(i); // => Kết quả in ra 0
    }
}
