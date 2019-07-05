import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by anton on 18/1/18.
 */
public class _135Candy {

    public int candy(int[] ratings) {

        int[] candies = new int[ratings.length];
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = 1 + candies[i - 1];
            }
        }
        for (int i = ratings.length - 1; i > 0; i--) {
            if (ratings[i - 1] > ratings[i] && candies[i - 1] <= candies[i]) {
                candies[i - 1] = candies[i] + 1;
            }
        }
        int sum = ratings.length;
        for (int c : candies) {
            sum += c;
        }
        return sum;

    }

}
