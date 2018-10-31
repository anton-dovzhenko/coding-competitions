import java.util.*;

/**
 * Created by anton on 3/4/17.
 */
public class _316RemoveDuplicateLetters {

    public String removeDuplicateLetters(String s) {
        TreeMap<Character, LinkedList<Integer>> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            LinkedList<Integer> positions = map.get(c);
            if (positions == null) {
                positions = new LinkedList<>();
                map.put(c, positions);
            }
            positions.add(i);
        }
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();
        while (!map.isEmpty()) {
            if (stack.isEmpty()) {
                stack.add(map.firstKey());
            } else {
                char c = stack.peek();
                int min = map.get(c).getFirst();
                boolean allowed = true;
                for (Map.Entry<Character, LinkedList<Integer>> e : map.entrySet()) {
                    if (e.getValue().getLast() < min) {
                        allowed = false;
                        break;
                    }
                }

                if (allowed) {
                    stack.pop();
                    sb.append(c);
                    map.remove(c);
                    for (Map.Entry<Character, LinkedList<Integer>> e : map.entrySet()) {
                        Iterator<Integer> iterator = e.getValue().iterator();
                        while (iterator.hasNext()) {
                            if (iterator.next() < min) {
                                iterator.remove();
                            } else {
                                break;
                            }
                        }
                    }
                } else {

                }
            }
        }
        return sb.toString();
    }

}
