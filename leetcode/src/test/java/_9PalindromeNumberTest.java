import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 13/1/17.
 */
public class _9PalindromeNumberTest {

    @Test
    public void isPalindrome() throws Exception {
        assertTrue(new _9PalindromeNumber().isPalindrome(1));
        assertTrue(new _9PalindromeNumber().isPalindrome(11));
        assertTrue(new _9PalindromeNumber().isPalindrome(121));
        assertFalse(new _9PalindromeNumber().isPalindrome(-1));
        assertFalse(new _9PalindromeNumber().isPalindrome(-11));
        assertFalse(new _9PalindromeNumber().isPalindrome(-121));
        assertFalse(new _9PalindromeNumber().isPalindrome(12));
        assertFalse(new _9PalindromeNumber().isPalindrome(-12));
        assertFalse(new _9PalindromeNumber().isPalindrome(122));
        assertFalse(new _9PalindromeNumber().isPalindrome(-122));
    }

    @Test
    public void isPalindromeSlow() throws Exception {
        assertTrue(new _9PalindromeNumber().isPalindromeSlow(1));
        assertTrue(new _9PalindromeNumber().isPalindromeSlow(11));
        assertTrue(new _9PalindromeNumber().isPalindromeSlow(121));
        assertFalse(new _9PalindromeNumber().isPalindromeSlow(-1));
        assertFalse(new _9PalindromeNumber().isPalindromeSlow(-11));
        assertFalse(new _9PalindromeNumber().isPalindromeSlow(-121));
        assertFalse(new _9PalindromeNumber().isPalindromeSlow(12));
        assertFalse(new _9PalindromeNumber().isPalindromeSlow(-12));
        assertFalse(new _9PalindromeNumber().isPalindromeSlow(122));
        assertFalse(new _9PalindromeNumber().isPalindromeSlow(-122));
    }


}