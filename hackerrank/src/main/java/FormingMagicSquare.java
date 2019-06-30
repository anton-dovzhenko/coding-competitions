import java.util.Arrays;

public class FormingMagicSquare {

    public static void main(String ... args) {
        int[][] s = new int[][]{{4, 9, 2}, {3, 5, 7}, {8, 1, 5}};
        int d = formingMagicSquare(s);
        System.out.println(d);

        s = new int[][]{{4, 8, 2}, {4, 5, 7}, {6, 1, 6}};
        d = formingMagicSquare(s);
        System.out.println(d);
    }

    /**
     * 1 2 3
     * 4 5 6
     * 7 8 9
     * @param s
     * @return
     */
    static int formingMagicSquare(int[][] s) {

        int distance = Integer.MAX_VALUE;
        boolean[] used = new boolean[10];
        int[] magic = new int[9];

        for (int i1 = 1; i1 < 10; i1++) {
            used[i1] = true;
            magic[0] = i1;

            for (int i2 = 1; i2 < 10; i2++) {
                if (used[i2]) {
                    continue;
                }
                used[i2] = true;
                magic[1] = i2;

                for (int i3 = 1; i3 < 10; i3++) {
                    if (used[i3]) {
                        continue;
                    }
                    used[i3] = true;
                    magic[2] = i3;

                    for (int i4 = 1; i4 < 10; i4++) {
                        if (used[i4]) {
                            continue;
                        }
                        used[i4] = true;
                        magic[3] = i4;
                        distance = Math.min(distance, completeMagicAndCompare(used, magic, s));
                        used[i4] = false;
                    }

                    used[i3] = false;
                }

                used[i2] = false;
            }

            used[i1] = false;
        }
        return distance;
    }

    static int completeMagicAndCompare(boolean[] used, int[] magic, int[][] s) {
        int magicNumber = magic[0] + magic[1] + magic[2];

        magic[6] = magicNumber - magic[0] - magic[3];
        if (isInvalidNumber(magic[6], used)) {
            return Integer.MAX_VALUE;
        } else {
            used[magic[6]] = true;
        }

        magic[4] = magicNumber - magic[2] - magic[6];
        if (isInvalidNumber(magic[4], used)) {
            used[magic[6]] = false;
            return Integer.MAX_VALUE;
        } else {
            used[magic[4]] = true;
        }

        magic[5] = magicNumber - magic[3] - magic[4];
        if (isInvalidNumber(magic[5], used)) {
            used[magic[6]] = false;
            used[magic[4]] = false;
            return Integer.MAX_VALUE;
        } else {
            used[magic[5]] = true;
        }

        magic[7] = magicNumber - magic[1] - magic[4];
        if (isInvalidNumber(magic[7], used)) {
            used[magic[6]] = false;
            used[magic[4]] = false;
            used[magic[5]] = false;
            return Integer.MAX_VALUE;
        } else {
            used[magic[7]] = true;
        }

        magic[8] = magicNumber - magic[0] - magic[4];
        if (isInvalidNumber(magic[8], used)
                || magic[2] + magic[5] + magic[8] != magicNumber
                || magic[6] + magic[7] + magic[8] != magicNumber) {
            used[magic[6]] = false;
            used[magic[4]] = false;
            used[magic[5]] = false;
            used[magic[7]] = false;
            return Integer.MAX_VALUE;
        }

        used[magic[6]] = false;
        used[magic[4]] = false;
        used[magic[5]] = false;
        used[magic[7]] = false;
        used[magic[8]] = false;

        return getDistance(s, magic);
    }

    private static int getDistance(int[][] s, int[] magic) {
        return Math.abs(magic[0] - s[0][0])
                + Math.abs(magic[1] - s[0][1])
                + Math.abs(magic[2] - s[0][2])
                + Math.abs(magic[3] - s[1][0])
                + Math.abs(magic[4] - s[1][1])
                + Math.abs(magic[5] - s[1][2])
                + Math.abs(magic[6] - s[2][0])
                + Math.abs(magic[7] - s[2][1])
                + Math.abs(magic[8] - s[2][2])
                ;
    }

    private static boolean isInvalidNumber(int n, boolean[] used) {
        return n < 1 || n > 9 || used[n];
    }

}
