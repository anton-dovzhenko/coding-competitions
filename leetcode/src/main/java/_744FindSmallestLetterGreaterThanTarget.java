import java.util.Arrays;

/**
 * Created by anton on 16/12/17.
 */
public class _744FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {
        int index = Arrays.binarySearch(letters, target);
        index = index >=0 ? index : -1 - index;;
        for (int i = index; i < letters.length; i++){
            if (letters[i] > target) {
                return letters[i];
            }
        }
        return letters[0];
    }
}
