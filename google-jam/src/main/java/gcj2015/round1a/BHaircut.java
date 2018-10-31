package gcj2015.round1a;

import common.ArrayUtils;
import common.MathUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by anton on 17/12/16.
 */
public class BHaircut {

    public static void main(String ... args) throws IOException {
        try (InputStream in = BHaircut.class.getResourceAsStream("/2015.round1a.B-small-practice.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                int B = sc.nextInt();
                int N = sc.nextInt();
                sc.nextLine();
                String line = sc.nextLine();
                String[] barbers = line.split(" ");
                long[] M = new long[barbers.length];
                for (int j = 0; j < barbers.length; j++) {
                    M[j] = Integer.parseInt(barbers[j]);
                }
                int index = getBarberNumber1(N, M);
                System.out.println(String.format("Case #%1$d: %2$d", i + 1, index));
            }
        }
    }

    public static int getBarberNumber1(int N, long[] M) {
        long maxM = ArrayUtils.max(M);
        long low = 0;
        long high = 1 + maxM * N / M.length;
        while (low + 1 < high) {
            long mid = (low + high) / 2;
            long served = getServedCount(mid, M);
            if (served < N) {
                low = mid;
            } else {
                high = mid;
            }

        }
        long served = getServedCount(low, M);
        PriorityQueue<Barber> barbers = new PriorityQueue<Barber>();
        for (int i = 0; i < M.length; i++) {
            barbers.add(new Barber(i, M[i] * (low / M[i])));
        }
        for (long i = served + 1; i < N; i++) {
            Barber barber = barbers.poll();
            barbers.add(new Barber(barber.index, barber.time + M[barber.index]));
        }
        return barbers.peek().index + 1;
    }

    private static long getServedCount(long time, long[] M) {
        long served = 0;
        for (int i = 0; i < M.length; i++) {
            served += time / M[i];
        }
        return served;
    }

    //Works for small, slow and incorrect? for large
    public static int getBarberNumber (int N, long[] M) {
        long lcm = MathUtils.lcm(M);
        int n = 0;
        for (int i = 0; i < M.length; i++) {
            n += lcm / M[i];
        }
        N = n + N % n;
        PriorityQueue<Barber> barbers = new PriorityQueue<Barber>();
        for (int i = 0; i < M.length; i++) {
            barbers.add(new Barber(i, 0));
        }
        for (int i = 0; i < N - 1; i++) {
            Barber barber = barbers.poll();
            barbers.add(new Barber(barber.index, barber.time + M[barber.index]));
        }
        return barbers.peek().index + 1;
    }

    private static class Barber implements Comparable<Barber> {
        final int index;
        final long time;

        public Barber(int index, long time) {
            this.index = index;
            this.time = time;
        }

        @Override
        public int compareTo(Barber o) {
            int comparison = Long.compare(time, o.time);
            if (comparison == 0) {
                comparison = Integer.compare(index, o.index);
            }
            return comparison;
        }
    }

}
