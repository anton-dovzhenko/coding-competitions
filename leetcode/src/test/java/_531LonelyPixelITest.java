import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 5/3/17.
 */
public class _531LonelyPixelITest {
    @Test
    public void findLonelyPixel() throws Exception {
        assertEquals(3, new _531LonelyPixelI().findLonelyPixel(new char[][]{
                {'W', 'W', 'B'},
                {'W', 'B', 'W'},
                {'B', 'W', 'W'}}
        ));
        assertEquals(1, new _531LonelyPixelI().findLonelyPixel(new char[][]{
                {'B', 'W', 'B'},
                {'W', 'B', 'W'},
                {'B', 'W', 'B'}}
        ));
        assertEquals(0, new _531LonelyPixelI().findLonelyPixel(new char[][]{
                {'B', 'B', 'B'},
                {'W', 'B', 'W'},
                {'B', 'W', 'B'}}
        ));
        String[] s = {
                "BWWWWBWBBW",
                "BBBWWWBWBW",
                "BBBBWWWBWW",
                "BWWBWBBWWW",
                "WWBWBBBWBB",
                "WBBWWWBWWW",
                "BWWBBBWWWW",
                "WWWBBBBWWW",
                "WWBBWWWWBW",
                "WWWBBBWWWB"};
        char[][] picture = new char[s.length][s[0].length()];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                picture[i][j] = s[i].charAt(j);
            }
        }
        assertEquals(0, new _531LonelyPixelI().findLonelyPixel(picture));
    }

}