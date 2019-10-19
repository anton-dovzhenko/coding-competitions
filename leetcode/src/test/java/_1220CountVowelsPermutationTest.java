import org.junit.Test;

import static org.junit.Assert.*;

public class _1220CountVowelsPermutationTest {

    @Test
    public void countVowelPermutation() {
        assertEquals(5, new _1220CountVowelsPermutation().countVowelPermutation(1));
        assertEquals(10, new _1220CountVowelsPermutation().countVowelPermutation(2));
        assertEquals(18208803, new _1220CountVowelsPermutation().countVowelPermutation(144));
    }
}