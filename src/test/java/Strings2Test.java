import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class Strings2Test {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream origOut = System.out;

    @BeforeEach
    public void setupStream(){
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    public void restoreStream(){
        System.setOut(new PrintStream(origOut));
    }

    @Test
    public void test(){
        System.setOut(new PrintStream(out));
        //System.out.print("hello");
        Strings2.main(new String[]{});
        Assertions.assertEquals("Original String : w3resource.com\r\n" +
                "Character(unicode point) = 51\r\n" +
                "Character(unicode point) = 101\r\n", out.toString());
        System.setOut(origOut);
        out.reset();
    }

}