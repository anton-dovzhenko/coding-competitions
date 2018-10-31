import java.util.Arrays;

/**
 * Created by anton on 29/4/18.
 */
public class _825FriendsOfAppropriateAges {

    public int numFriendRequests(int[] ages) {
        int[] ageCount = new int[121];
        for (int i = 0; i < ages.length; i++) {
            ageCount[ages[i]]++;
        }
        for (int i = 1; i < ageCount.length; i++) {
            ageCount[i] += ageCount[i - 1];
        }
        int count = 0;
        for (int i = 0; i < ages.length; i++) {
            int min = 1 + ages[i] / 2 + 7;
            int max = ages[i];
            if (min > max) {
                continue;
            }
//            System.out.println("age = " + ages[i]);
//            System.out.println("min = " + min);
//            System.out.println("max = " + max);
//            System.out.println("ageCount[max] = " + ageCount[max]);
//            System.out.println("ageCount[min] = " + ageCount[min]);
//            System.out.println("ageCount[min - 1] = " + ageCount[min - 1]);
            count += ageCount[max] - ageCount[min - 1] - 1;
//            System.out.println("count = " + count);
//            System.out.println("------------");
        }
        return count;
    }

}
