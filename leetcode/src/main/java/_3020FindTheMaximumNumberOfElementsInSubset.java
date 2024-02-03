import java.util.TreeMap;

public class _3020FindTheMaximumNumberOfElementsInSubset {

    public int maximumLength(int[] nums) {
        TreeMap<Integer, Integer> sorted = new TreeMap<>();
        for (int n : nums) {
            sorted.put(n, sorted.getOrDefault(n, 0) + 1);
        }
        int maxLen = getOneLength(sorted.getOrDefault(1, 0));
        for (int key : sorted.keySet()) {
            int len = 0;
            int cnt = sorted.get(key);
            sorted.put(key, 0);
            if (cnt == 1) {
                len = 1;
            } else if (cnt >= 2) {
                len = 1;
                while (true) {
                    key *= key;
                    cnt = sorted.getOrDefault(key, 0);
                    if (cnt == 0) {
                        break;
                    } else {
                        sorted.put(key, 0);
                        len += 2;
                        if (cnt == 1) {
                            break;
                        }
                    }
                }
            }
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }

    private int getOneLength(int ones) {
        if (ones == 0) {
            return 0;
        }
        return ones % 2 == 0 ? ones - 1 : ones;
    }

    public static void main(String... args) {
        System.out.println(new _3020FindTheMaximumNumberOfElementsInSubset().maximumLength(new int[]{5, 4, 1, 2, 2}));
        System.out.println(new _3020FindTheMaximumNumberOfElementsInSubset().maximumLength(new int[]{1, 3, 2, 4}));
        System.out.println(new _3020FindTheMaximumNumberOfElementsInSubset().maximumLength(new int[]{1, 1}));
        System.out.println(new _3020FindTheMaximumNumberOfElementsInSubset().maximumLength(
                new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024}));
    }

}
