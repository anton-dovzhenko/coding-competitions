package gcj2016.round1a;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by anton on 14/1/17.
 */
public class ATheLastWord {

    public static void main(String ... args) throws IOException {
        try (InputStream in = ATheLastWord.class.getResourceAsStream("/2016.round1a.A-large-practice.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                String result = getLastWord(sc.nextLine());
                System.out.println(String.format("Case #%d: %s", i + 1, result));
            }
        }
    }

    public static String getLastWord(String S) {
        StringBuilder sb = new StringBuilder();
        sb.append(S.charAt(0));
        for (int i = 1; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c >= sb.charAt(0)) {
                sb.insert(0, c);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
