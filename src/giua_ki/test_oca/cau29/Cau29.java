package giua_ki.test_oca.cau29;

public class Cau29 {

    static void testV1() {
        int x = 5;
        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7); //=> Kết quả là 8

        /**
         * Câu lênh trên tương đương với:
         * if(x>2){
         *     if(x<4){10}
         *     else{8}
         * }else{7}
         * */
    }

    public static void main(String[] args) {
        testV1();
    }
}
