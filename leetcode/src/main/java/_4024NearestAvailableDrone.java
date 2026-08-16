public class _4024NearestAvailableDrone {

    public int nearestDrone(int[][] drones, int[] target) {
        int index = -1;
        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i < drones.length; i++) {
            int[] d = drones[i];
            int dist = Math.abs(d[0] - target[0]) + Math.abs(d[1] - target[1]);
            if (dist <= d[2] && dist < minDist) {
                minDist = dist;
                index = i;
            }
        }
        return index;
    }

}
