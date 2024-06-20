package cuoi_ki.de_3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Cau2 {

    /**
     * Cho đoạn chương trình sau:
     * Map<String, Integer> map = new HashMap<String, Integer>();
     * map.put("key12", 3);
     * map.put("key99", 1);
     * map.put("key8", 2);
     * map.put("key12", 1);
     * Collection<Integer> values = map.values();
     * System.out.println(values);
     * <p>
     * Kết quả sẽ là gì?
     * a. [1, 1, 2, 3]
     * b. [1, 1, 2]
     * c. [3, 1, 2]
     * d. [3, 1, 2, 1]
     * <p>
     * Đáp án: b
     */

    static void testV1() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("key12", 3);
        map.put("key99", 1);
        map.put("key8", 2);
        map.put("key12", 1);

        Collection<Integer> values = map.values();
        System.out.println(values); //=> [1, 1, 2]
    }

    static void testV2() {
        Map<String, Integer> map = new TreeMap<String, Integer>();
        map.put("key12", 3);
        map.put("key99", 1);
        map.put("key8", 2);
        map.put("key12", 1);

        Collection<Integer> values = map.values();
        System.out.println(values); //=> [1,2,1]
    }

    public static void main(String[] args) {
        testV1();
        testV2();
    }
}
