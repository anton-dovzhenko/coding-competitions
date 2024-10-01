import org.junit.Test;

import static org.junit.Assert.*;

public class _3304FindTheKthCharacterInStringGameITest {

    @Test
    public void kthCharacter() {
        assertEquals('b', new _3304FindTheKthCharacterInStringGameI().kthCharacter(5));
        assertEquals('c', new _3304FindTheKthCharacterInStringGameI().kthCharacter(10));
    }
}