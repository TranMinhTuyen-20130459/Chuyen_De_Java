package cuoi_ki.de_1;

public class Cau27 {

    /**
     * Cho đoạn chương trình sau:
     * public class Mixer {
     * Mixer m1;
     * Mixer() { }
     * Mixer(Mixer m) {this.m1 = m;}
     * void go() {System.out.print("hi "); }
     * public static void main(String[] args) {
     * Mixer m2 = new Mixer();
     * Mixer m3 = new Mixer(m2);
     * m3.go();
     * Mixer m4 = m3.m1;
     * m4.go();
     * }
     * }
     * Kết quả sẽ là gì?
     * a. hi
     * b. hi hi
     * c. hi, sau đó báo lỗi
     * d. hi hi, sau đó báo lỗi
     * <p>
     * Đáp án: b
     */

    class Mixer {
        Mixer m1;

        Mixer() {
        }

        Mixer(Mixer m) {
            this.m1 = m;
        }

        void go() {
            System.out.print("hi ");
        }

    }

    public static void main(String[] args) {
        Cau27 cau27 = new Cau27();
        Mixer m2 = cau27.new Mixer();
        Mixer m3 = cau27.new Mixer(m2);
        m3.go();
        Mixer m4 = m3.m1;
        m4.go();
    }

}
