package giua_ki.test_oca.cau40;

public class Main2 {

    public String checkIt(String s) {
        if (s == null || s.length() == 0) {
            return "EMPTY";
        } else
            return "NOT EMPTY";
    }

    public static void main(String[] args) {
        Main2 a = new Main2();
        a.checkIt(null); // Empty nhưng không in ra gì cả tại vì không có System.out.println
    }
}
