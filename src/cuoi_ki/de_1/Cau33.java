package cuoi_ki.de_1;

public class Cau33 {

    /**
     * Cho đoạn chương trình sau:
     * public class Forest implements Serializable {
     * private Tree tree = new Tree(this);
     * public static void main(String[] args) {
     * Forest f = new Forest();
     * try {
     * FileOutputStream fs = new FileOutputStream("Forest.ser");
     * ObjectOutputStream os = new ObjectIntputStream(fs);
     * os.writeObject(f);
     * os.close();
     * } catch (Exception exp) { exp.printStackTrace();}
     * }
     * }
     * class Tree implements Serializable {
     * }
     * Kết quả sẽ là gì?
     * a. Báo lỗi
     * b. Ném ra ngoại lệ trong quá trình biên dịch
     * c. Một thể hiện của lớp Forest được ghi vào file Forest.ser
     * d. Một thể hiện của lớp Forest và một thể hiện của lớp Tree được ghi vào file Forest.ser
     *
     * Đáp án: a
     * Lý do:
     * + Lớp Tree không có constructor không tham số, nên khi khởi tạo Tree trong lớp Forest sẽ báo lỗi.
     * + ObjectInputStream không thuộc nhóm OutputStream mà nó thuộc nhóm InputStream.
     */
}
