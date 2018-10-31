package gcj2016.round1a;

/**
 * Created by anton on 14/1/17.
 */
public class CBFFs {

    public static int getMaxCircleSize(int N, int[] friends) {
        for (int i = 0; i < N; i++) {
            friends[i]--;
        }


        int max = 0;
        for (int i = 0; i < N; i++) {
            int id = i;
            int lastID = id;
            int circleLength = 1;
            int potentialLength = 0;
            boolean[] inCircle = new boolean[N];
            inCircle[id] = true;
            while (!inCircle[id = friends[id]]) {
                circleLength++;
                if (friends[id] == i || friends[id] == lastID) {
                    potentialLength = circleLength;
                }
                inCircle[id] = true;
                lastID = id;
            }

            if (potentialLength > max) {
                max = potentialLength;
            }
        }
        return max;
    }
}
