package giua_ki.test_oca.cau37;

public class Cau37 {

    static void testV1() {
        // StringBuilder is mutable, so line.append() return line
        StringBuilder line = new StringBuilder("-");
        StringBuilder anotherLine = line.append("-");
        System.out.print(line == anotherLine);
        System.out.print(" ");
        System.out.print(line.length());
    }

    static void testV2() {
        // String is immutable, so line.concat() return new String
        String line = "-";
        String anotherLine = line.concat("-"); // line.concat() return new String
        System.out.print(line == anotherLine);
        System.out.print(" ");
        System.out.print(line.length());
    }

    static void testV3() {
        // String is immutable, so line.concat() return new String
        String line = "-";
        String anotherLine = line + "-";
        System.out.print(line == anotherLine);
        System.out.print(" ");
        System.out.print(line.length());
    }

    public static void main(String[] args) {
        testV1();
        System.out.println("");
        testV2();
        System.out.println("");
        testV3();
    }
}
