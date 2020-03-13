import java.util.*;

public class _451SortCharactersByFrequency {


    public String frequencySort(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        List<int[]> freqs = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                freqs.add(new int[] {i, freq[i]});
            }
        }
        Collections.sort(freqs, (o1, o2) -> {
            if (o1[1] != o2[1]) {
                return Integer.compare(o2[1], o1[1]);
            }
            return Integer.compare(o1[0], o2[0]);
        });

        StringBuilder sb = new StringBuilder();
        for (int[] f : freqs) {
            for (int i = 0; i < f[1]; i++) {
                sb.append((char) f[0]);
            }
        }
        return sb.toString();
    }

}
