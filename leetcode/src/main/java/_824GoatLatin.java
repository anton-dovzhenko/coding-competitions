import java.util.Arrays;
import java.util.List;

/**
 * Created by anton on 29/4/18.
 */
public class _824GoatLatin {

    private static final List<Character> vowels = Arrays.asList(new Character[] {'a', 'e', 'i', 'o', 'u'});

    public String toGoatLatin(String S) {
        String[] words = S.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 0) {
                char firstChar = Character.toLowerCase(word.charAt(0));
                if (vowels.contains(firstChar)) {
                    word += "ma";
                } else {
                    word = word.substring(1) + word.charAt(0) + "ma";
                }
                for (int j = 0; j <= i; j++) {
                    word += "a";
                }
            }
            words[i] = word;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);
            result.append(" ");
        }
        result.delete(result.length() - 1, result.length());
        return result.toString();
    }

}
