import org.junit.Test;

import static org.junit.Assert.*;

public class _3021AliceAndBobPlayingFlowerGameTest {

    @Test
    public void flowerGame() {
        assertEquals(3, new _3021AliceAndBobPlayingFlowerGame().flowerGame(3, 2));
        assertEquals(0, new _3021AliceAndBobPlayingFlowerGame().flowerGame(1, 1));
    }
}