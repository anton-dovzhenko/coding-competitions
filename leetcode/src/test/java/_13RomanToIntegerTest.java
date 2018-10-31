import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 13/1/17.
 */
public class _13RomanToIntegerTest {

    @Test
    public void romanToInt() throws Exception {
        assertEquals(1, new _13RomanToInteger().romanToInt("I"));
        assertEquals(2, new _13RomanToInteger().romanToInt("II"));
        assertEquals(3, new _13RomanToInteger().romanToInt("III"));
        assertEquals(4, new _13RomanToInteger().romanToInt("IV"));
        assertEquals(5, new _13RomanToInteger().romanToInt("V"));
        assertEquals(6, new _13RomanToInteger().romanToInt("VI"));
        assertEquals(7, new _13RomanToInteger().romanToInt("VII"));
        assertEquals(8, new _13RomanToInteger().romanToInt("VIII"));
        assertEquals(9, new _13RomanToInteger().romanToInt("IX"));
        assertEquals(10, new _13RomanToInteger().romanToInt("X"));
        assertEquals(11, new _13RomanToInteger().romanToInt("XI"));
        assertEquals(12, new _13RomanToInteger().romanToInt("XII"));
        assertEquals(14, new _13RomanToInteger().romanToInt("XIV"));
        assertEquals(18, new _13RomanToInteger().romanToInt("XVIII"));
        assertEquals(19, new _13RomanToInteger().romanToInt("XIX"));
        assertEquals(20, new _13RomanToInteger().romanToInt("XX"));
        assertEquals(23, new _13RomanToInteger().romanToInt("XXIII"));
        assertEquals(24, new _13RomanToInteger().romanToInt("XXIV"));
        assertEquals(29, new _13RomanToInteger().romanToInt("XXIX"));
        assertEquals(40, new _13RomanToInteger().romanToInt("XL"));
        assertEquals(44, new _13RomanToInteger().romanToInt("XLIV"));
        assertEquals(49, new _13RomanToInteger().romanToInt("XLIX"));
        assertEquals(69, new _13RomanToInteger().romanToInt("LXIX"));
        assertEquals(89, new _13RomanToInteger().romanToInt("LXXXIX"));
        assertEquals(98, new _13RomanToInteger().romanToInt("XCVIII"));
        assertEquals(99, new _13RomanToInteger().romanToInt("XCIX"));
        assertEquals(890, new _13RomanToInteger().romanToInt("DCCCXC"));
    }

}