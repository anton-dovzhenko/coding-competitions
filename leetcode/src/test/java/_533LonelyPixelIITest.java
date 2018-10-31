import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 5/3/17.
 */
public class _533LonelyPixelIITest {
    @Test
    public void findBlackPixel() throws Exception {
        assertEquals(6, new _533LonelyPixelII().findBlackPixel(new char[][]
                {
                        {'W', 'B', 'W', 'B', 'B', 'W'},
                        {'W', 'B', 'W', 'B', 'B', 'W'},
                        {'W', 'B', 'W', 'B', 'B', 'W'},
                        {'W', 'W', 'B', 'W', 'B', 'W'}},
                3));

        String[] s = {
                "WBWBBW",
                "BWBWWB",
                "WBWBBW",
                "BWBWWB",
                "WBWBBW",
                "BWBWWB"};
        char[][] picture = new char[s.length][s[0].length()];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                picture[i][j] = s[i].charAt(j);
            }
        }
        assertEquals(18, new _533LonelyPixelII().findBlackPixel(picture, 3));

        s = new String[]{
                "WWBWBWBWWBBW",
                "WBWBWWBWWBBW",
                "WWWBWWBBBWWW",
                "WWBWBWBWWBBW",
                "BWWBWWBBBWWW",
                "WBWBWWBWWBBW",
                "WWBWBWBWWBBW",
                "WWBWBWBWWBBW",
                "WBWBWWBWWBBW",
                "WWWBWWBWWBBW",
                "BWWBWWBBBWWW",
                "WWWWBWBWWBBW",
                "BWWBWWBBBWWW",
                "BWWBWWBBBWWW",
                "WBWBWWBWWBBW"};

        //WWBWBWBWWBBW
        //WWWWBWBWWBBW
        picture = new char[s.length][s[0].length()];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                picture[i][j] = s[i].charAt(j);
            }
        }
        assertEquals(0, new _533LonelyPixelII().findBlackPixel(picture, 5));
    }

}