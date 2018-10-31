package gcj2015.round1b;

import static java.lang.Math.ceil;

/**
 * Created by anton on 19/12/16.
 */
public class BNoisyNeighbors {

    public static int getUnhappinessLevel(int R, int C, int N) {
        if (N <= ceil( R * C / 2)) {
            return 0;
        }
        return -1;
    }


}
