package giua_ki.cau_hoi_tren_lop_thuc_hanh.oop;

class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

public class PassingVar {

    public void modify(Student st) {
        st.setName("Tran Thi B");
        st = new Student("Le Van C");
    }

    public void test() {
        Student sv1 = new Student("Nguyen Van A");
        System.out.println("Before modify():" + sv1.toString());
        modify(sv1);
        System.out.println("After modify():" + sv1.toString());
    }

    public static void main(String[] args) {
        PassingVar pv = new PassingVar();
        pv.test();
    }
}
