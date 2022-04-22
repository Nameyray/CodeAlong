import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageCipherTest {
    @Test
    public void cipherLetter_returnsCharPlusTwoPosition_C(){
        MessageCipher messageCipher = new MessageCipher();
        Character expected = 'C';
        assertEquals(expected, messageCipher.cipherLetter('A'));
    }

    @Test
    public void cipherLetter_returnsCypherWord_C(){
        MessageCipher messageCipher = new MessageCipher();
        Character expected = 'C';
        assertEquals(expected, messageCipher.cipherLetter('A'));
    }

}
