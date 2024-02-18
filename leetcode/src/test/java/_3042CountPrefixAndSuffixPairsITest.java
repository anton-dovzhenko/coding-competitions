import org.junit.Test;

import static org.junit.Assert.*;

public class _3042CountPrefixAndSuffixPairsITest {

    @Test
    public void countPrefixSuffixPairs() {
        assertEquals(4, new _3042CountPrefixAndSuffixPairsI().countPrefixSuffixPairs(new String[]{"a", "aba", "ababa", "aa"}));
        assertEquals(2, new _3042CountPrefixAndSuffixPairsI().countPrefixSuffixPairs(new String[]{"pa", "papa", "ma", "mama"}));
        assertEquals(0, new _3042CountPrefixAndSuffixPairsI().countPrefixSuffixPairs(new String[]{"abab", "ab"}));
    }
}