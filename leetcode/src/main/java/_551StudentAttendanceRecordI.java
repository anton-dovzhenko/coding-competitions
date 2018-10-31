/**
 * Created by anton on 15/7/17.
 */
public class _551StudentAttendanceRecordI {

    public boolean checkRecord(String s) {
        int aCount = 0;
        int lInRow = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'L') {
                if (++lInRow == 3) {
                    return false;
                }
            } else {
                lInRow = 0;
                if (c == 'A' && 1 < ++aCount) {
                    return false;
                }
            }
        }
        return true;
    }

}
