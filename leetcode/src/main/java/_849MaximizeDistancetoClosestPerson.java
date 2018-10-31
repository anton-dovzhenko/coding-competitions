/**
 * Created by anton on 17/6/18.
 */
public class _849MaximizeDistancetoClosestPerson {

    public int maxDistToClosest(int[] seats) {
        int length = seats.length;
        int start = -1;
        int distance = 0;
        for (int i = 0; i < length - 1; i++) {
            if (seats[i] == 1) {
                if (start == -1) {
                    distance = Math.max(distance, i);
                } else {
                    distance = Math.max(distance, (i - start) / 2);
                }
                start = i;
            }
        }
        if (seats[length - 1] == 1) {
            if (start == -1) {
                distance = length - 1;
            } else {
                distance = Math.max(distance, (length - 1 - start) / 2);
            }
        } else {
            distance = Math.max(distance, length - 1 - start);
        }
        return distance;
    }

}
