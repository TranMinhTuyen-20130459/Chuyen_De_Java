package giua_ki.de_8_5_2024;

public class Cau3 {

    static void testV1() {
        int arr[] = {2, 4, 8, 16, 32};
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }
        System.out.println("Output old: " + result);
        result = 0;
        for (int a : arr) {
            result = result + a;
        }
        System.out.println("Output new: " + result);
    }

    public static void main(String[] args) {
        testV1(); //=> Output old: 62, Output new: 62
    }
}
