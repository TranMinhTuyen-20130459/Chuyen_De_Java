package giua_ki.test_oca.cau40;

public class Main3 {

    public String checkIt(String s) {
        if (s == null || s.length() == 0) {
            return "EMPTY";
        } else
            return "NOT EMPTY";
    }

    public static void main(String[] args) {
        Main3 a = new Main3();
        System.out.println(a.checkIt(null)); // In ra "EMPTY"
    }
}
