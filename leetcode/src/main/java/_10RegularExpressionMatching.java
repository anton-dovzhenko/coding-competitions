import java.util.*;

/**
 * Created by anton on 15/9/18.
 */
public class _10RegularExpressionMatching {

    private final static class Rule {

        char c;
        boolean single;

        private Rule(char c, boolean single) {
            this.c = c;
            this.single = single;
        }

        boolean isMatch(char a) {
            return c == 0 || c == a;
        }

    }

    public boolean isMatch(String s, String p) {
        List<Rule> rules = getRules(p);
        if (s.length() == 0 && isCompleted(rules, -1)) {
            return true;
        }
        Set<Integer> pointers = getPointers(rules);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Set<Integer> nextPointers = new HashSet<>();
            for (Integer pointer : pointers) {
                Rule r = rules.get(pointer);
                if (r.isMatch(c)) {
                    if (i == s.length() - 1 && isCompleted(rules, pointer)) {
                        return true;
                    }
                    if (!r.single) nextPointers.add(pointer);
                    for (int j = pointer + 1; j < rules.size(); j++) {
                        nextPointers.add(j);
                        if (rules.get(j).single) {
                            break;
                        }
                    }
                }

            }
            if (nextPointers.isEmpty()) {
                return false;
            }
            pointers = nextPointers;
        }
        return false;
    }

    private List<Rule> getRules(String p) {
        List<Rule> rules = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (c == '.') {
                rules.add(new Rule((char) 0, true));
            } else if (c == '*') {
                rules.get(rules.size() - 1).single = false;
            } else {
                rules.add(new Rule(c, true));
            }
        }
        return rules;
    }

    private Set<Integer> getPointers(List<Rule> rules) {
        Set<Integer> pointers = new HashSet<>();
        for (int i = 0; i < rules.size(); i++) {
            pointers.add(i);
            if (rules.get(i).single) {
                break;
            }
        }
        return pointers;
    }

    private boolean isCompleted(List<Rule> rules, int pointer) {
        for (int i = pointer + 1; i < rules.size(); i++) {
            if (rules.get(i).single) {
                return false;
            }
        }
        return true;
    }

}
