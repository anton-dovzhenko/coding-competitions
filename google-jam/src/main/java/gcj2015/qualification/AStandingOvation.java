package gcj2015.qualification;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by anton on 12/12/16.
 */
public class AStandingOvation {

    public static void main(String ... args) throws IOException {
        try (InputStream in = AStandingOvation.class.getResourceAsStream("/2015.qualification.A-large-practice.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                String line = sc.nextLine();
                String levels = line.split(" ")[1];
                int[] shynessLevels = new int[levels.length()];
                for (int j = 0; j < levels.length(); j++) {
                    shynessLevels[j] = levels.charAt(j) - '0';
                }
                int additionalFriends = getAdditionalFriends(shynessLevels);
                System.out.println(String.format("Case #%1$d: %2$d", i + 1, additionalFriends));
            }
        }
    }

    public static int getAdditionalFriends(int[] shynessLevels) {

        int standing = 0;
        int additional = 0;
        for (int i = 0; i < shynessLevels.length; i++) {
            if (standing >= i) {
                standing += shynessLevels[i];
            } else {
                int toAdd = i - standing;
                additional += toAdd;
                standing += shynessLevels[i] + toAdd;
            }
        }
        return additional;
    }


}
