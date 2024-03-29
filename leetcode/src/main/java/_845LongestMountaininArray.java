public class _845LongestMountaininArray {

    public int longestMountain(int[] arr) {
        int max_mountain = 0;
        int up = 0;
        int down = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                up = 0;
                down = 0;
            } else if (arr[i] > arr[i - 1]) {
                if (down > 0) {
                    up = 1;
                } else {
                    up++;
                }
                down = 0;
            } else {
                if (up > 0) {
                    down++;
                }
            }
            max_mountain = Math.max(max_mountain, getMountainLength(up, down));
        }
        return max_mountain + (max_mountain > 0 ? 1 : 0);
    }

    private int getMountainLength(int up, int down) {
        return (int) ((up + down) * Math.signum(up) * Math.signum(down));
    }

}
