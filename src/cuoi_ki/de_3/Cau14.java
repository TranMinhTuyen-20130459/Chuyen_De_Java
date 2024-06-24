package cuoi_ki.de_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cau14 {

    /**
     * Cho đoạn chương trình sau:
     * public static List reverse(List list) {
     * Collections.reverse(list);
     * return list;}
     * public static void main(String[] args) {
     * List list = new ArrayList();
     * list.add("1");
     * list.add("2");
     * list.add("3");
     * for (Object oblect : reverse(list)) {
     * System.out.print(oblect + ", ");
     * } }
     * Kết quả sẽ là gì?
     * a. 3, 2, 1,
     * b. 3, 2, 1
     * c. 1, 2, 3,
     * d. 1, 2, 3
     * <p>
     * =>> Đáp án là a
     */

    public static List reverse(List list) {
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        for (Object oblect : reverse(list)) {
            System.out.print(oblect + ", ");
        }
    }
}
