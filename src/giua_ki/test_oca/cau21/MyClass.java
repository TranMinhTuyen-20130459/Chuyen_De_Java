package giua_ki.test_oca.cau21;

public class MyClass {
    public final static void main(String... args) {
        int flavors = 30;
        int myField = 0;
        switch (flavors) {
            case 30:
                myField++;
            case 40:
                myField += 2;
            default:
                myField--;
        }
        System.out.print(myField); //=> Kết quả in ra: 2
    }
}
