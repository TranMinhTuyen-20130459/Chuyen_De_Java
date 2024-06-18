package giua_ki.de_9_5_2024;

public class Cau1 {

    static String testMethodA(Object obj) {
        return "Object";
    }

    static String testMethodA(String s) {
        return "String";
    }

    public static void main(String[] args) {
        String result = Cau1.testMethodA(new String());
        System.out.println(result);
    }
}
