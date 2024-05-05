package giua_ki.test_oca.cau34;

public class Cau34 {

      /*
      static void testV1() {
            int i = 0, j = 5;
            lab1:
            for (; ; i++) {
                for (; ; --j) if (i > j) break lab1;
                System.out.println("i = " + i + ", j = " + j); // Lỗi biên dịch
            }
        }
       */

    static void testV2() {
        int i = 0, j = 5;
        lab1:
        for (; ; i++) {
            for (; ; --j) if (i > j) break lab1;
        }
        System.out.println("i = " + i + ", j = " + j);
        //=> Kết quả: i = 0, j = -1
    }

    public static void main(String[] args) {
        testV2();
    }
}
