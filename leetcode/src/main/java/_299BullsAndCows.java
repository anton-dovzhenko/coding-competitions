import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by anton on 28/3/17.
 */
public class _299BullsAndCows {

    public String getHint(String secret, String guess) {
        int[] secretCows = new int[10];
        int[] guessCows = new int[10];
        int bulls = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                secretCows[secret.charAt(i) - '0']++;
                guessCows[guess.charAt(i) - '0']++;
            }
        }
        int cows = 0;
        for (int i = 0; i < 10; i++) {
            cows += Math.min(secretCows[i], guessCows[i]);
        }
        return bulls + "A" + cows + "B";
    }

}
