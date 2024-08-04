public class _3232FindIfDigitGameCanBeWon {

    public boolean canAliceWin(int[] nums) {
        int oneDigit = 0;
        int twoDigit = 0;
        for (int n : nums) {
            if (n < 10) {
                oneDigit += n;
            } else {
                twoDigit += n;
            }
        }
        return oneDigit != twoDigit;
    }

}
