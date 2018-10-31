import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by anton on 9/7/18.
 */
public class _726NumberofAtoms {


    private enum State {
        Null,
        Element,
        Number
    }


    public String countOfAtoms(String formula) {
        Map<String, Integer> cs = new HashMap<>();
        countOfAtoms(formula, 0, cs);
        cs = new TreeMap<>(cs);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> e : cs.entrySet()) {
            if (!e.getKey().isEmpty()) {
                sb.append(e.getKey());
                if (e.getValue() > 1) {
                    sb.append(e.getValue());
                }
            }
        }
        return sb.toString();
    }


    private int countOfAtoms(String f, int i, Map<String, Integer> cs) {
        Map<String, Integer> subf = null;
        State state = State.Null;
        String lastEl = "";
        String lastNum = "";
        while (i < f.length()) {
            char c = f.charAt(i);
            if (Character.isAlphabetic(c)) {
                merge(cs, subf, getLastNum(lastNum));
                subf = null;
                if (Character.isLowerCase(c)) {
                    lastEl += c;
                } else {
                    cs.put(lastEl, cs.getOrDefault(lastEl, 0) + getLastNum(lastNum));
                    lastEl = Character.toString(c);
                    lastNum = "";
                }
                state = State.Element;
            } else if (Character.isDigit(c)) {
                if (state == State.Number) {
                    lastNum += c;
                } else {
                    lastNum = Character.toString(c);
                }
                state = State.Number;
            } else if ('(' == c) {
                merge(cs, subf, getLastNum(lastNum));
                subf = new HashMap<>();
                cs.put(lastEl, cs.getOrDefault(lastEl, 0) + getLastNum(lastNum));
                lastEl = "";
                lastNum = "";
                state = State.Null;
                i = countOfAtoms(f, i + 1, subf);
            } else if (')' == c) {
                merge(cs, subf, getLastNum(lastNum));
                cs.put(lastEl, cs.getOrDefault(lastEl, 0) + getLastNum(lastNum));
                return i;
            } else {
                throw new UnsupportedOperationException();
            }

            i++;

        }
        merge(cs, subf, getLastNum(lastNum));
        cs.put(lastEl, cs.getOrDefault(lastEl, 0) + getLastNum(lastNum));
        return f.length();
    }

    private int getLastNum(String lastNumber) {
        return lastNumber.isEmpty() ? 1 : Integer.parseInt(lastNumber);
    }

    private void merge(Map<String, Integer> counts, Map<String, Integer> subformula, int m) {
        if (subformula == null) {
            return;
        }
        for (Map.Entry<String, Integer> e : subformula.entrySet()) {
            counts.put(e.getKey(), counts.getOrDefault(e.getKey(), 0) + e.getValue() * m);
        }
    }

}
