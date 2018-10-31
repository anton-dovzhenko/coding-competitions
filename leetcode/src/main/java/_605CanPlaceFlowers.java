/**
 * Created by anton on 2/7/17.
 */
public class _605CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        int addedFlowers = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0
                    && (i == flowerbed.length - 1  || i < flowerbed.length - 1 && flowerbed[i + 1] == 0)
                    && (i == 0 || i > 0 && flowerbed[i - 1] == 0)) {
                flowerbed[i] = 1;
                addedFlowers++;
                if (addedFlowers == n) {
                    return true;
                }
            }
        }
        return false;
    }

}
