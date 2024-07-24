public class _3226NumberOfBitChangesToMakeTwoIntegersEqual {

    public int minChanges(int n, int k) {
        int check = n ^ k;
        if ((check & k) > 0) {
            return -1;
        }
        return Integer.bitCount(check);
    }

}
