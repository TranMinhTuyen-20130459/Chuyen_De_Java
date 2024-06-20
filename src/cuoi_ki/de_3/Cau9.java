package cuoi_ki.de_3;

import java.util.Set;
import java.util.TreeSet;

public class Cau9 {

    /**
     * Cho đoạn chương trình sau:
     * public class MyClass {
     * public enum Alphabet{C, E, D}
     * public static void main(String[] args) throws Exception {
     * Set< Alphabet > set = new TreeSet< Alphabet >();
     * set.add(Alphabet.E);
     * set.add(Alphabet.C);
     * set.add(Alphabet.D);
     * System.out.println(set);
     * }}
     * Kết quả sẽ là gì?
     * a. [C, E, D]
     * b. [D, E, C]
     * c. [E, C, D]
     * d. [E, D, C]
     * <p>
     * Đáp án: a
     */

    public enum Alphabet {C, E, D}

    static void testV1() {
        Set<Alphabet> set = new TreeSet<Alphabet>();
        set.add(Alphabet.E);
        set.add(Alphabet.C);
        set.add(Alphabet.D);
        System.out.println(set);
    }

    public static void main(String[] args) {
        testV1();
    }

}
