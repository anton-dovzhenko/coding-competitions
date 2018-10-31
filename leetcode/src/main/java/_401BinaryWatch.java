import java.util.*;

/**
 * Created by anton on 29/12/17.
 */
public class _401BinaryWatch {

    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();
         for (int hh = 0; hh < 12; hh++) {
             for (int mm = 0; mm < 60; mm++) {
                 if (Integer.bitCount(hh) + Integer.bitCount(mm) == num) {
                     times.add(hh + ":" + (mm > 9 ? "" : "0")+ mm);
                 }
             }
         }
        return times;
    }


}
