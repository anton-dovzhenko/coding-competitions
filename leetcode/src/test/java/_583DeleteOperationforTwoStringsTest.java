import org.junit.Test;

import static org.junit.Assert.*;

public class _583DeleteOperationforTwoStringsTest {

    @Test
    public void minDistance() {
        assertEquals(2, new _583DeleteOperationforTwoStrings().minDistance("sea", "eat"));       // 2
        assertEquals(5, new _583DeleteOperationforTwoStrings().minDistance("mart", "karma"));    // 5
        assertEquals(7, new _583DeleteOperationforTwoStrings().minDistance("food", "money"));    // 7
        assertEquals(59, new _583DeleteOperationforTwoStrings().minDistance(
                "ebvivhpfxoptspwianmuhmkmbhxkqbrbgpfwpfcjixzhsjmtsgrzfshvkrvoxvjpmmsrojnpgzqdyofvicscopak",
                "vxoumkmxbpcixzhtrfhxmnzqyvisp"));    // 59
    }
}