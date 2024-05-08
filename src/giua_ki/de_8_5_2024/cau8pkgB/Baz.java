/*
package giua_ki.de_8_5_2024.cau8pkgB;

import giua_ki.de_8_5_2024.cau8pkgA.Foo;

public class Baz extends Foo {

    public void display() {
        Foo f = new Foo();
        System.out.println(f.c);
        System.out.println(f.b); // Lỗi biên dịch vì b là protected và
    }

    public static void main(String[] args) {
        new Baz().display();
    }

    */
/**
 * Trong Java, một thành viên protected có thể truy cập được trong cùng một package và cũng bởi một lớp con của lớp đó ở một package khác. Tuy nhiên, lớp con ở package khác chỉ có thể truy cập thành viên protected thông qua kế thừa, không phải qua tham chiếu đối tượng rõ ràng.
 * Trong trường hợp của bạn, Baz là một lớp con của Foo và nằm trong một package khác. Vì vậy, nó có thể truy cập thành viên protected b của Foo thông qua kế thừa. Nhưng khi bạn tạo một đối tượng rõ ràng của Foo trong Baz như Foo f = new Foo(); và cố gắng truy cập b bằng tham chiếu đối tượng này f.b, nó dẫn đến lỗi biên dịch vì b được bảo vệ trong Foo.
 **//*

}
*/
