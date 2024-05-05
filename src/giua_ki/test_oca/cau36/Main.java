package giua_ki.test_oca.cau36;

class Exception1 extends Exception {
}

public class Main {
    public void m() throws Exception { // r1
        try {
            throw new Exception("This Exception");
        } catch (RuntimeException e) {
            throw new Exception1(); // r2
        } finally {
            throw new RuntimeException("Or maybe this one");
        }
    }

    public static void main(String[] moat) throws Exception {
        new Main().m(); // r3

        //=> Kết quả: chương trình vẫn biên dịch nhưng lỗi khi chạy
    }
}
