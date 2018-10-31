import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by anton on 3/4/17.
 */
public class _316RemoveDuplicateLettersTest {
    @Test
    public void removeDuplicateLetters() throws Exception {
//        System.out.println(Arrays.binarySearch(new int[] {1, 3, 5}, -10));
//        System.out.println(Arrays.binarySearch(new int[] {1, 3, 5}, 0));
//        System.out.println(Arrays.binarySearch(new int[] {1, 3, 5}, 1));
//        System.out.println(Arrays.binarySearch(new int[] {1, 3, 5}, 2));
//        System.out.println(Arrays.binarySearch(new int[] {1, 3, 5}, 3));
//        System.out.println(Arrays.binarySearch(new int[] {1, 3, 5}, 4));
//        System.out.println(Arrays.binarySearch(new int[] {1, 3, 5}, 5));
//        System.out.println(Arrays.binarySearch(new int[] {1, 3, 5}, 6));
        assertEquals("abc", new _316RemoveDuplicateLetters().removeDuplicateLetters("bcabc"));
        assertEquals("acdb", new _316RemoveDuplicateLetters().removeDuplicateLetters("cbacdcbc"));
    }

}