import java.util.*;

/**
 * Created by anton on 8/10/18.
 */
public class _115DistinctSubsequences {


    public int numDistinct(String s, String t) {
        Map<Character, Set<Integer>> states = new HashMap<>();
        Map<Integer, Integer> paths = new HashMap<>();

        states.put(t.charAt(0), new HashSet<>(Arrays.asList(0)));
        paths.put(0, 0);
        System.out.println("------");
        System.out.println(states);
        System.out.println(paths);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println("------ " + c + "------");
            Set<Integer> indices = states.get(c);
            if (indices != null) {
                for (int index : indices) {
                    int count = paths.get(index);
                    paths.put(index, count + 1);
                    if (index < t.length() - 1) {
                        paths.put(index + 1, paths.getOrDefault(index + 1, 0) + 1);
                        char next = t.charAt(index + 1);
                        Set<Integer> nextIndices = states.get(next);
                        if (nextIndices == null) {
                            nextIndices = new HashSet<>();
                            states.put(next, nextIndices);
                        }
                        nextIndices.add(index + 1);
                    }
                }
            }
            System.out.println(states);
            System.out.println(paths);
            //if (states.containsKey(c))
        }
        return paths.getOrDefault(t.length() - 1, 0);
    }

}
