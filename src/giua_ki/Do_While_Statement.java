package giua_ki;

public class Do_While_Statement {

    /**
     * Câu 1: Hãy điền code vào đoạn có comment "insert code here" để chương trình in ra kết quả là x = 12
     */
    static void cau1() {
        int x = 0;
        int y = 11; // insert code here
        do {

        } while (x++ < y);
        System.out.println("x = " + x); // Kết quả cần in ra là x = 12
    }

    /**
     * Câu 2: Hãy điền code vào đoạn có comment "insert code here" để chương trình in ra kết quả là x = 12
     */
    static void cau2() {
        int x = 0;
        int y = 12; // insert code here
        do {
            x++;
        } while (x < y);
        System.out.println("x = " + x); // Kết quả cần in ra là x = 12
    }

    /**
     * Câu 3: Hãy điền code vào đoạn có comment "insert code here" để chương trình in ra kết quả là x = 12
     */
    static void cau3() {
        int x = 0;
        int y = 12; // insert code here
        do {

        } while (++x < y);
        System.out.println("x = " + x); // Kết quả cần in ra là x = 12
    }

    /**
     * Câu 4: Hãy điền code vào đoạn có comment "insert code here" để chương trình in ra kết quả là x = 12
     */
    static void cau4() {
        int x = 0;
        int y = 12; // insert code here
        do {
            ++x;
        } while (x < y);
        System.out.println("x = " + x); // Kết quả cần in ra là x = 12
    }

    public static void main(String[] args) {
        //cau1();
        //cau2();
        //cau3();
        cau4();
    }
}
