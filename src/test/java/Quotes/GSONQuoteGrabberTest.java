package Quotes;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.nio.file.NoSuchFileException;

import static Quotes.GSONQuoteGrabber.quoteGetter;
import static org.junit.Assert.*;

public class GSONQuoteGrabberTest {

    @Test
    public void quoteGetterTest() {
        String filePath = "/Users/rkktt/401/Quotes/assets/recentquotes.json";
        String output1 = quoteGetter(filePath);
        String output2 = quoteGetter(filePath);
        String output3 = quoteGetter(filePath);
        assertNotEquals(output1, output2);
        assertNotEquals(output2, output3);
        assertNotEquals(output1, output3);
    }
    @Test
    public void fileNotFoundExceptionTest() {
        String filePath = "CTRL+V/USERS";
        assertEquals("File Not Found", quoteGetter(filePath));

    }

}