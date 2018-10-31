package common;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by anton on 17/12/16.
 */
public class ArrayUtils {

    public static long max(long[] values) {
        long max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max)
                max = values[i];
        }
        return max;
    }

    public static double min(double[] values) {
        double min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i]< min)
                min = values[i];
        }
        return min;
    }

    public static double max(double[] values) {
        double max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max)
                max = values[i];
        }
        return max;
    }

}
