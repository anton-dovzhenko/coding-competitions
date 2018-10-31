package gcj2017.round1A;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by anton on 15/4/17.
 */
public class C {

    public static void main(String ... args) throws IOException {
        try (InputStream in = C.class.getResourceAsStream("/2017.A-small.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                long N = new Long(sc.nextLine());
                //long result = getLastTidyNumber(N);
                System.out.println(String.format("Case #%1$d: %2$d", i + 1, null));
            }
        }
    }
}
