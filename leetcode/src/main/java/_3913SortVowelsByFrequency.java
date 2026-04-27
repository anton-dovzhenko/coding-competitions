import java.util.*;

public class _3913SortVowelsByFrequency {

    private static class Vowel implements Comparable<Vowel> {

        private final char c;
        private final int order;
        private int count;

        private Vowel(char c, int order, int count) {
            this.c = c;
            this.order = order;
            this.count = count;
        }

        private void addToCounter(int n) {
            count += n;
        }

        @Override
        public int compareTo(Vowel o) {
            int c = -Integer.compare(count, o.count);
            return c != 0 ? c : Integer.compare(order, o.order);
        }

    }

    public String sortVowels(String s) {
        char[] sc = s.toCharArray();
        Map<Character, Vowel> counter = new HashMap<>();
        for (int i = 0; i < sc.length; i++) {
            char c = sc[i];
            if (isVowel(c)) {
                if (counter.containsKey(c)) {
                    counter.get(c).addToCounter(1);
                } else {
                    counter.put(c, new Vowel(c, i, 1));
                }
            }
        }
        LinkedList<Vowel> orderedVowels = new LinkedList<>(counter.values());
        Collections.sort(orderedVowels);

        for (int i = 0; i < sc.length; i++) {
            if (isVowel(sc[i])) {
                Vowel v = orderedVowels.getFirst();
                sc[i] = v.c;
                v.addToCounter(-1);
                if (v.count == 0) {
                    orderedVowels.removeFirst();
                }
            }
        }
        return new String(sc);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
