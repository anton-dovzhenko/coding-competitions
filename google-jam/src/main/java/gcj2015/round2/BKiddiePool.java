package gcj2015.round2;

import common.ArrayUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by anton on 24/12/16.
 */
public class BKiddiePool {

    public static void main(String ... args) throws IOException {
        try (InputStream in = BKiddiePool.class.getResourceAsStream("/2015.round2.B-small-practice.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < cases; i++) {
                String[] lineItems = sc.nextLine().split(" ");
                int N = Integer.parseInt(lineItems[0]);
                double V = Double.parseDouble(lineItems[1]);
                double X = Double.parseDouble(lineItems[2]);
                double[] R = new double[N];
                double[] C = new double[N];
                for (int j = 0; j < N; j++) {
                    String[] items = sc.nextLine().split(" ");
                    R[j] = Double.parseDouble(items[0]);
                    C[j] = Double.parseDouble(items[1]);
                }


                double seconds = getMinTime(N, V, X, R, C);
                if (seconds >= 0) {
                    System.out.println(String.format("Case #%1$d: %2$.9f", i + 1, seconds));
                } else {
                    System.out.println(String.format("Case #%1$d: IMPOSSIBLE", i + 1));
                }
            }

        }
    }

    public static double getMinTime(int N, double V, double X, double[] R, double[] C) {
        if (N == 1) {
            if (C[0] == X) {
                return V / R[0];
            } else {
                return -1;
            }
        }

        if (ArrayUtils.min(C) > X || ArrayUtils.max(C) < X) {
            return -1;
        }

        if (N == 2) {
            if (C[0] == C[1]) {
                return V / (R[0] + R[1]);
            }
            double x = Math.abs((X - C[1]) / (C[1] - C[0]));
            return Math.max(V * x / R[0], V * (1 - x) / R[1]);
        }

        return -1;
    }

}
