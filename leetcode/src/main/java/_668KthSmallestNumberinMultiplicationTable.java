import java.util.Arrays;

public class _668KthSmallestNumberinMultiplicationTable {

    public int findKthNumber(int m, int n, int k) {
        int low = 1;
        int high = n * m;
        while (low < high) {
            int mid = (low + high) / 2;
            int c = count(mid, Math.min(m, n), Math.max(m, n));
            if (c >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }

    private int count(int mid, int m, int n) {
        int c = 0;
        for (int i = 1; i <= m; i++) {
            c += Math.min(mid / i, n);
        }
        return c;
    }

    public int findKthNumber1(int m, int n, int k) {
        int number = 0;
        int count = 0;

        int m0 = Math.min(m, n);
        int n0 = Math.max(m, n);

        while (count < k) {
            number++;
            if (number % 100_000 == 0) {
                System.out.println(number / 100_000 + " K");
            }

            for (int i = Math.max(1, number / n0); i <= Math.min(Math.sqrt(number), m0); i++) {
                if (number % i == 0) {
                    int div = number / i;
                    if (div > 0 && div <= n0) {
                        count++;
                    }
                    if (div != i && div <= m0) {
                        int div1 = number / div;
                        if (div1 > 0 && div1 <= n0) {
                            count++;
                        }
                    }
                }
            }

        }

        return number;
    }

    public int findKthNumber0(int m, int n, int k) {
        int[] array = new int[m * n];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[index++] = (i + 1) * (j + 1);
            }
        }
        Arrays.sort(array);
        return array[k - 1];
    }

}
