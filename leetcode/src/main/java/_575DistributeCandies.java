import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by anton on 15/7/17.
 */
public class _575DistributeCandies {

    public int distributeCandies(int[] candies) {
        int allKinds = IntStream.of(candies).boxed().collect(Collectors.toSet()).size();
        return Math.min(allKinds, candies.length / 2);
    }

    public int distributeCandies2(int[] candies) {
        int allKinds = 0;
        Arrays.sort(candies);
        int kind = candies[0] - 1;
        for (int i = 0; i < candies.length; i++) {
           if (candies[i] != kind) {
               allKinds++;
               kind = candies[i];
           }
        }
        return Math.min(allKinds, candies.length / 2);
    }

    public int distributeCandies3(int[] candies) {
        HashSet<Integer> kinds = new HashSet<>();
        for (int i = 0; i < candies.length; i++) {
            kinds.add(candies[i]);
        }
        return Math.min(kinds.size(), candies.length / 2);
    }

}
