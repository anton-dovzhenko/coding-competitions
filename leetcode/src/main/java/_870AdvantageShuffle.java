import java.util.*;

/**
 * Created by anton on 15/7/18.
 */
public class _870AdvantageShuffle {

    public int[] advantageCount(int[] A, int[] B) {
        TreeMap<Integer, Integer> aMap = new TreeMap<>();
        for (int a : A) {
            aMap.put(a, aMap.getOrDefault(a, 0) + 1);
        }

        List<Integer> aOrder = new ArrayList<>(A.length);
        for (int b : B) {
            NavigableMap<Integer, Integer> n = aMap.subMap(b, false, Integer.MAX_VALUE, true);
            Map.Entry<Integer, Integer> ceiling = n.firstEntry();
            if (ceiling == null) {
                int first = aMap.firstKey();
                aOrder.add(aMap.firstKey());
                int keyLeft = aMap.get(first);
                if (keyLeft == 1) {
                    aMap.remove(first);
                } else {
                    aMap.put(first, keyLeft - 1);
                }
            } else {
                aOrder.add(ceiling.getKey());
                if (ceiling.getValue() == 1) {
                    aMap.remove(ceiling.getKey());
                } else {
                    aMap.put(ceiling.getKey(), ceiling.getValue() - 1);
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            A[i] = aOrder.get(i);
        }
//        System.out.println(Arrays.toString(A));
        return A;
    }

}
