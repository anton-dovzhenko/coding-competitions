public class _3516FindClosestPerson {

    public int findClosest(int x, int y, int z) {
        int d1 = Math.abs(z - x);
        int d2 = Math.abs(z - y);
        return d1 == d2 ? 0 : d1 < d2 ? 1 : 2;
    }

}
