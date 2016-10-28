package org.fundacionjala.quizfinal;

import org.junit.Test;

import static org.fundacionjala.quizfinal.SpinWords.spinWords;
import static org.junit.Assert.assertEquals;

public class SpinWordsTest {
    @Test
    public void test() {
        assertEquals("emocleW", spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", spinWords("Hey fellow warriors"));
        assertEquals("This is a test", spinWords("This is a test"));
        assertEquals("This is rehtona test", spinWords("This is another test"));
        assertEquals("You are tsomla to the last test", spinWords("You are almost to the last test"));
        assertEquals("Just gniddik ereht is llits one more", spinWords("Just kidding there is still one more"));
        assertEquals("ylsuoireS this is the last one", spinWords("Seriously this is the last one"));
    }
}
