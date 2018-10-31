import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 25/8/17.
 */
public class _60PermutationSequenceTest {

    @Test
    public void testGetPermutation() throws Exception {
        System.out.println(new _60PermutationSequence().getPermutation(1, 1));
        System.out.println(new _60PermutationSequence().getPermutation(3, 1));
        System.out.println(new _60PermutationSequence().getPermutation(3, 2));
        System.out.println(new _60PermutationSequence().getPermutation(3, 3));
        System.out.println(new _60PermutationSequence().getPermutation(3, 4));
        System.out.println(new _60PermutationSequence().getPermutation(3, 5));
        System.out.println(new _60PermutationSequence().getPermutation(3, 6));
        for (int i = 1; i <= 24; i++) {
            System.out.println(new _60PermutationSequence().getPermutation(4, i));
        }
    }
}