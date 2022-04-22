import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageCipherTest {
    @Test
    public void cipherLetter_returnsCharPlusTwoPosition_C(){
        MessageCipher messageCipher = new MessageCipher();
        Character expected = 'D';
        assertEquals(expected, messageCipher.cipherLetter('B'));
    }

    @Test
    public void cipherLetter_returnsCypherWord_DQA(){
        MessageCipher messageCipher = new MessageCipher();
        String expected = "DQA";
        assertEquals(expected, messageCipher.cipherWord("BOY"));
    }

    @Test
    public void cipherLetter_returnsCypherWord_TCEJGN(){
        MessageCipher messageCipher = new MessageCipher();
        String expected = "TCEJGN";
        assertEquals(expected, messageCipher.cipherWord("RACHEL"));
    }

}
