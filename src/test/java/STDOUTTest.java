import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by Storm on 05.09.2016.
 */
public class STDOUTTest {
    @org.junit.Test
    public void stdout() throws Exception {
        STDOUT testStdout = new STDOUT();

        int[][] mass = { {1,2}, {2,1}, {3,4}, {5,6}, {6,5}};

        String expectedOUTPUT = "1 2 1\r\n" +
                "5 6 5\r\n";


        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // After this all System.out.println() statements will come to outContent stream.

        // So, you can normally call,
        testStdout.stdout(mass);

        assertEquals(outContent.toString(), expectedOUTPUT);

    }

}