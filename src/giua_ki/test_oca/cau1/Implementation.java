package giua_ki.test_oca.cau1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Implementation implements Printable, Writable {

    // insert code here
    @Override
    public void abc() throws FileNotFoundException {

    }

    /**
     * Class Implementation triển khai cả hai interface Printable và Writable.
     * Do đó, nó phải cung cấp một triển khai cho phương thức abc().
     * Tuy nhiên, phương thức abc() trong Writable ném ra FileNotFoundException
     * trong khi phương thức abc() trong Printable ném ra IOException.
     * FileNotFoundException là một lớp con của IOException,
     * do đó, khi triển khai phương thức abc(), lớp Implementation ném ra FileNotFoundException
     * để tuân thủ cả hai giao diện.
     * */


}
