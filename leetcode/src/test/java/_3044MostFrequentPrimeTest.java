import org.junit.Test;

import static org.junit.Assert.*;

public class _3044MostFrequentPrimeTest {

    @Test
    public void mostFrequentPrime() {
        assertEquals(19, new _3044MostFrequentPrime().mostFrequentPrime(new int[][]{{1, 1}, {9, 9}, {1, 1}}));
        assertEquals(97, new _3044MostFrequentPrime().mostFrequentPrime(new int[][]{{9, 7, 8}, {4, 6, 5}, {2, 8, 6}}));
        assertEquals(823, new _3044MostFrequentPrime().mostFrequentPrime(new int[][]{{9,3,8}, {4,2,5}, {3,8,6}}));
    }
    
}