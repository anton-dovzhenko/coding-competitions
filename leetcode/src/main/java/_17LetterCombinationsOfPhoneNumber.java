import java.util.ArrayList;
import java.util.List;

/**
 * Created by anton on 26/2/17.
 */
public class _17LetterCombinationsOfPhoneNumber {

    private final String[] numToChar = {
            " ", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        combinations.add("");
        for (int i = 0; i < digits.length(); i++) {
            combinations = nextCombinations(combinations, numToChar[digits.charAt(i) - '0']);
        }
        return combinations;
    }

    public List<String> nextCombinations(List<String> combinations, String code) {
        List<String> next = new ArrayList<>();
        for (int i = 0; i < code.length(); i++) {
            for (String combination : combinations) {
                next.add(combination + code.charAt(i));
            }
        }
        return next;
    }

}
