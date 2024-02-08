public class _3028AntOnTheBoundary {

    public int returnToBoundaryCount(int[] nums) {
        int count = 0;
        int nsum = 0;
        for (int n : nums) {
            nsum += n;
            if (nsum == 0) {
                count++;
            }
        }
        return count;
    }

}
