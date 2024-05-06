package giua_ki.test_oca.cau40;

public class Main {
    public String checkIt(String s) {
        if (s.length() == 0 || s == null) {
            return "EMPTY";
        } else
            return "NOT EMPTY";
    }

    public static void main(String[] args) {
        Main a = new Main();
        a.checkIt(null); // Lỗi NullPointerException vì s.length() sẽ bị gọi trước khi kiểm tra s == null
    }
}
