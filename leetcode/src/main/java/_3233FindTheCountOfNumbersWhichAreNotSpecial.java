import java.util.ArrayList;
import java.util.List;

public class _3233FindTheCountOfNumbersWhichAreNotSpecial {

    private final static List<Integer> specialNums = new ArrayList<>();
    static {
        int i = 2;
        while (i * i <= 1_000_000_000) {
            int square = i * i;
            boolean special = true;
            for (int sn : specialNums) {
                if (square % sn == 0) {
                    special = false;
                    break;
                }
            }
            if (special) {
                specialNums.add(square);
            }
            i++;
        }
    }

    public int nonSpecialCount(int l, int r) {
        int specialCnt = 0;
        for (int sn : specialNums) {
            if (sn >= l && sn <= r) {
                specialCnt++;
            }
            if (sn >= r) {
                break;
            }

        }
        return (r - l + 1) - specialCnt;
    }

}
