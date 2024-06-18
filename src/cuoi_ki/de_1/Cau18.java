package cuoi_ki.de_1;

import java.util.HashSet;
import java.util.Set;

public class Cau18 {

    public class SinhVien {

        private String maSV;

        public SinhVien(String mSSV) {
            maSV = mSSV;
        }

        public boolean equals(SinhVien sv) {
            return this.maSV.equalsIgnoreCase(sv.maSV);
        }

    }

    public static void main(String[] args) {
        SinhVien sv1 = new Cau18().new SinhVien("123");
        SinhVien sv2 = new Cau18().new SinhVien("123");
        Set<SinhVien> s = new HashSet<>();
        s.add(sv1);
        s.add(sv2);
        System.out.println(s.size()); // => Kết quả in ra 2
    }

}
