/**
 * Created by anton on 29/8/17.
 */
public class _171ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        int result = 0;
        int multiplier = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            result += (1 + s.charAt(i) - 'A') * multiplier;
            multiplier *= 26;
        }
        return result;
    }

}
