package cuoi_ki.de_1;

import java.util.Set;
import java.util.TreeSet;

public class Cau28 {

    /**
     * Cho đoạn chương trình sau:
     * 1. //insert code here
     * 2. set.add(34);
     * 3. set.add(1);
     * 4. System.out.println(set);
     * Đoạn lệnh nào dưới đây khi thêm vào dòng 1 sẽ đảm bảo rằng kết quả in
     * ra là [1, 34]
     * a. Set<Integer> set = new ArraySet<Integer>();
     * b. Set<Integer> set = new HashSet<Integer>();
     * c. Set<Integer> set = new TreeSet<Integer>();
     * d. Set<Integer> set = new SortedSet<Integer>()
     * Đáp án: b
     */

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        set.add(34);
        set.add(1);
        System.out.println(set);
    }
}
