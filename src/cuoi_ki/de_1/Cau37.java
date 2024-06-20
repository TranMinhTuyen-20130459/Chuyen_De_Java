package cuoi_ki.de_1;

import java.util.Set;
import java.util.TreeSet;

public class Cau37 {

    /**
     * Cho đoạn chương trình sau:
     * public class MyClass {
     * public enum Fruit{BANANA, ORANGE, COCONUT}
     * public static void main(String[] args) throws Exception {
     * Set<Fruit> set = new TreeSet<Fruit>();
     * set.add(Fruit.BANANA);
     * set.add(Fruit.ORANGE);
     * set.add(Fruit.COCONUT);
     * System.out.println(set);
     * }
     * }
     * Kết quả sẽ là gì?
     * a. [BANANA, ORANGE, COCONUT]
     * b. [ORANGE , BANANA, COCONUT]
     * c. [COCONUT, BANANA, ORANGE]
     * d. [BANANA, COCONUT , ORANGE]
     * <p>
     * Đáp án : a
     * Lý do:
     * + Trong Java, TreeSet là một cấu trúc dữ liệu dựa trên cây nhị phân tìm kiếm cân bằng.
     * + Nó tự động sắp xếp các phần tử theo thứ tự tăng dần.
     * + Khi sắp xếp các phần tử kiểu Enum, TreeSet sẽ sắp xếp theo thứ tự các phần tử được khai báo trong Enum.
     */

    public enum Fruit {
        BANANA,
        ORANGE,
        COCONUT
    }

    static void testV1() {
        Set<Fruit> set = new TreeSet<Fruit>();
        set.add(Fruit.BANANA);
        set.add(Fruit.ORANGE);
        set.add(Fruit.COCONUT);
        System.out.println(set);
    }

    static void testV2() {
        Set<Fruit> set = new TreeSet<Fruit>();
        set.add(Fruit.ORANGE);
        set.add(Fruit.BANANA);
        set.add(Fruit.COCONUT);
        System.out.println(set);
    }

    static void testV3() {
        Set<Fruit> set = new TreeSet<Fruit>();
        set.add(Fruit.COCONUT);
        set.add(Fruit.BANANA);
        set.add(Fruit.ORANGE);
        System.out.println(set);
    }

    public static void main(String[] args) {
        testV1(); //=> kết quả là: [BANANA, ORANGE, COCONUT]
        testV2(); //=> kết quả là: [BANANA, ORANGE, COCONUT]
        testV3(); //=> kết quả là: [BANANA, ORANGE, COCONUT]
    }
}
