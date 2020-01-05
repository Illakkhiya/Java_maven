import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleTest {

    @Test
    public void test1() throws IOException {
        Assert.assertEquals(1,1);
        String str = "Hello";
        BufferedWriter writer = new BufferedWriter(new FileWriter("Hello.txt"));
        writer.write(str);
        writer.close();
    }
}
