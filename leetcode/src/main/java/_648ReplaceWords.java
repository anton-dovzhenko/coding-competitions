import java.util.*;

/**
 * Created by anton on 20/9/17.
 */
public class _648ReplaceWords {

    public String replaceWords(List<String> dict, String sentence) {
        Set<String> successors = new HashSet<>(dict);
        Map<Character, Set<Integer>> successorsLengths = new HashMap<>();
        for (String s : dict) {
            Set<Integer> set = successorsLengths.get(s.charAt(0));
            if (set == null) {
                set = new TreeSet<>();
                successorsLengths.put(s.charAt(0), set);
            }
            set.add(s.length());
        }
        StringBuilder sb = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ");
        while (tokenizer.hasMoreTokens()) {
            String token = replaceToken(successors, successorsLengths, tokenizer.nextToken());
            sb.append(token).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private String replaceToken(Set<String> successors
            , Map<Character, Set<Integer>> successorsLengths, String token) {
        Set<Integer> set = successorsLengths.get(token.charAt(0));
        if (set != null) {
            for (Integer successorLength : set) {
                if (successorLength >= token.length()) {
                    break;
                } else {
                    String successor = token.substring(0, successorLength);
                    if (successors.contains(successor)) {
                        return successor;
                    }
                }
            }
        }
        return token;
    }

}
