import java.util.LinkedList;

/**
 * Created by anton on 17/6/18.
 */
public class _844BackspaceStringCompare {

    public boolean backspaceCompare(String S, String T) {
        LinkedList<Character> s = new LinkedList<>();
        LinkedList<Character> t = new LinkedList<>();
        for (int i = 0; i < S.length(); i++) {
            addCharacter(s, S.charAt(i));
        }
        for (int i = 0; i < T.length(); i++) {
            addCharacter(t, T.charAt(i));
        }
        return s.equals(t);
    }

    private void addCharacter(LinkedList<Character> sequence, char c) {
        if (c == '#') {
            if (!sequence.isEmpty()) {
                sequence.removeLast();
            }
        } else {
            sequence.add(c);
        }
    }

}
