package giua_ki;

public class Break_Statement {

    /**
     * Câu 1: Cho biết kết quả của chương trình sau khi thực thi
     */
    static void cau1() {
        int out, in = 1000;
        for (out = 0; out < 10; out++) {
            for (in = 0; in < 20; in++) {
                if (in > 10) break;
            }
            System.out.println("inside the outer loop: out= " + out + ",in= " + in);
        }
        System.out.println("end of the outer loop: out= " + out + ",in= " + in);
    }

    /**
     * Câu2 : Cho biết kết quả của chương trình sau khi thực thi
     */
    static void cau2() {
        int out, in = 1000;
        outer:
        for (out = 0; out < 10; out++) {
            for (in = 0; in < 20; in++) {
                if (in > 10) break outer; // thoát khỏi vòng lặp ngoài có nhãn outer
            }
            System.out.println("inside the outer loop: out= " + out + ",in= " + in);
        }
        System.out.println("end of the outer loop: out= " + out + ",in= " + in);
    }


    public static void main(String[] args) {
        //cau1();
        cau2();
    }
}
