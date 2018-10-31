package gcj2015.round2;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.*;

/**
 * Created by anton on 26/12/16.
 */
public class CBilingualTest {

    @Test
    public void testGetSameWords() throws Exception {
        assertEquals(1, CBilingual.getSameWords(2
                        , new HashSet<>(Arrays.asList("he", "loves", "to", "eat", "baguettes"))
                        , new HashSet<>(Arrays.asList("il", "aime", "manger", "des", "baguettes"))
                        , null
                ));
    }

}