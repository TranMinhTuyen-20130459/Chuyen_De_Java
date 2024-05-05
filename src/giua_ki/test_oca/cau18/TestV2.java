package giua_ki.test_oca.cau18;

interface Foo {
    int x = 10; //=> mặc định là biến public static final
}

public class TestV2 implements Foo {

    int y;

    public TestV2() {
        y = x + 10;
    }

    public static void main(String[] args) {
        TestV2 test = new TestV2();
        System.out.println(test.y);
        System.out.println(test.x);
    }
}
