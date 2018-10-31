import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by anton on 18/1/18.
 */
public class _135Candy {

    public int candy(int[] ratings) {

        int minRating = ratings[0];
        for (int i = 1; i < ratings.length; i++) {
            minRating = Math.min(minRating, ratings[i]);
        }
        for (int i = 0; i < ratings.length; i++) {
            ratings[i] = ratings[i] - minRating + 1;
        }

        List<Integer> grRatings = new ArrayList<>();
        List<Integer> multipliers = new ArrayList<>();
        int multiplier = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] == ratings[i - 1]) {
                multiplier++;
            } else {
                grRatings.add(ratings[i - 1]);
                multipliers.add(multiplier);
                multiplier = 1;
            }
        }
        grRatings.add(ratings[ratings.length - 1]);
        multipliers.add(multiplier);

        int sum = Integer.MAX_VALUE;
        while (true) {
            int nextSum = 0;
            for (int i = 0; i < grRatings.size() - 1; i++) {
                int valPrev = grRatings.get(i == 0 ? i + 1 : i - 1);
                int valNext = grRatings.get(i == grRatings.size() - 1 ? i - 1 : i + 1);
                int val = grRatings.get(i);
                int min = Math.min(valPrev, valNext);
                int max = Math.max(valPrev, valNext);
                if (val < min) {
                    grRatings.set(i, 1);
                }
                if (val > max) {
                    grRatings.set(i, max + 1);
                }
                if (val < max && val > min) {
                    grRatings.set(i, min + 1);
                }
                nextSum += grRatings.get(i);
            }

            if (nextSum == sum) {
                break;
            }
            sum = nextSum;
        }

        int result = 0;
        for (int i = 0; i < grRatings.size(); i++) {
            result += grRatings.get(i) * multipliers.get(i);
        }
        return result;
    }

}
