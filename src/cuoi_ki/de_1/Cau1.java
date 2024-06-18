package cuoi_ki.de_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Cau1 {

    static void testV1() {

        // Câu hỏi: Kết quả in ra là gì?
        Map<String, String> map = new HashMap<>();
        map.put("key12", "orange");
        map.put("key99", "mango");
        map.put("key8", "lemon");
        map.put("key12", "banana");
        Set<String> keySet = map.keySet();
        keySet = new TreeSet<String>(keySet);
        System.out.println(keySet); //=> Kết quả in ra [key12, key8, key99]

        /**
         * `TreeSet` sắp xếp các phần tử dựa trên giá trị của chúng. Trong trường hợp này, các khóa là các chuỗi (`String`), và `TreeSet` sẽ sắp xếp chúng theo thứ tự từ điển.
         * Trong thứ tự từ điển, các chuỗi được so sánh từng ký tự một từ trái sang phải. Trong trường hợp này, "key12", "key8", và "key99" đều bắt đầu bằng "key", nên phần "key" không ảnh hưởng đến thứ tự sắp xếp. Thay vào đó, các số sau "key" được so sánh.
         * Khi so sánh các số, "12", "8", và "99", chúng được so sánh như các chuỗi, không phải như các số nguyên. Do đó, "12" đứng trước "8" và "99" vì ký tự đầu tiên của "12" là "1", và "1" nhỏ hơn cả "8" và "9".
         * =>> khi các khóa được sắp xếp trong `TreeSet`, "key12" đứng trước cả "key8" và "key99".
         * */

    }

    static void testV2() {

        // Câu hỏi: Kết quả in ra là gì?
        Map<String, String> map = new HashMap<>();
        map.put("key12", "orange");
        map.put("key99", "mango123456");
        map.put("key8", "lemon987654");
        map.put("key12", "banana");
        Set<String> keySet = map.keySet();
        System.out.println(keySet); //=> Kết quả in ra là dựa vào giá trị băm của khóa

        /**
         *`HashMap` trong Java không đảm bảo thứ tự của các phần tử. Nó lưu trữ các cặp khóa-giá trị dựa trên giá trị băm của khóa. Khi bạn thêm một phần tử mới vào `HashMap`, nó sẽ sử dụng giá trị băm của khóa để xác định vị trí lưu trữ phần tử đó. Do đó, thứ tự của các phần tử trong `HashMap` không phản ánh thứ tự chúng được thêm vào.
         *
         * Tuy nhiên, `TreeSet` trong Java duy trì thứ tự của các phần tử dựa trên giá trị của chúng. Nó sử dụng cây nhị phân tìm kiếm cân bằng (red-black tree) để lưu trữ các phần tử, cho phép nó duy trì thứ tự của các phần tử một cách hiệu quả.
         *
         * Vì vậy, khi bạn chuyển đổi `Set` của các khóa từ `HashMap` sang `TreeSet`, các khóa sẽ được sắp xếp theo thứ tự tăng dần dựa trên giá trị của chúng.
         *  */
    }

    static void testValueForThisObject(Object obj) {
        if (obj == null) throw new NullPointerException("Object is null");
        int hashCode = obj.hashCode();
        System.out.println("Giá trị băm của \"" + obj.toString() + "\" là: " + hashCode);
    }

    public static void main(String[] args) {
        testV1();
        testV2();

        testValueForThisObject("key12");
        testValueForThisObject("key8");
        testValueForThisObject("key99");

    }
}
