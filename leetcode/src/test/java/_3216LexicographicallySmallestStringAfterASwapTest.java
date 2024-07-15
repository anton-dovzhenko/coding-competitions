import junit.framework.TestCase;

public class _3216LexicographicallySmallestStringAfterASwapTest extends TestCase {

    public void testGetSmallestString() {
        assertEquals("43520", new _3216LexicographicallySmallestStringAfterASwap().getSmallestString("45320"));
        assertEquals("001", new _3216LexicographicallySmallestStringAfterASwap().getSmallestString("001"));
    }

}