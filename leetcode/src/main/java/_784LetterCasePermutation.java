import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by anton on 4/4/18.
 */
public class _784LetterCasePermutation {

    public List<String> letterCasePermutation(String S) {
        return letterCasePermutation(S, 0, Arrays.asList(""));
    }

    private List<String> letterCasePermutation(String S, int index, List<String> result) {
        if (index == S.length()) {
            return result;
        } else {
            List<String> newResult = new LinkedList<>();
            for (String s : result) {
                if (Character.isLetter(S.charAt(index))) {
                    newResult.add(s + Character.toLowerCase(S.charAt(index)));
                    newResult.add(s + Character.toUpperCase(S.charAt(index)));
                } else {
                    newResult.add(s + S.charAt(index));
                }
            }
            return letterCasePermutation(S, ++index, newResult);
        }
    }

}
