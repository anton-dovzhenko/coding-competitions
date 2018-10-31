import java.util.HashMap;
import java.util.Map;

/**
 * Created by anton on 8/7/17.
 */
public class _599MinimumIndexSumOfTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {
        if (list1.length > list2.length) {
            String[] temp = list2;
            list2 = list1;
            list1 = temp;
        }
        Map<String, Integer> indexMap = getIndexMap(list2);
        for (int i = 0; i < list1.length; i++) {
            Integer value = indexMap.get(list1[i]);
            if (value != null) {
                indexMap.put(list1[i], -(value + 1) + i);
            }
        }
        int min = Integer.MAX_VALUE;
        for (Integer value : indexMap.values()) {
            if (value > -1 && value < min) {
                min = value;
            }
        }
        return getMinKeys(indexMap, min);
    }

    private Map<String, Integer> getIndexMap(String[] list) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.length; i++) {
            map.put(list[i], -i - 1);
        }
        return map;
    }

    private String[] getMinKeys(Map<String, Integer> indexMap, int min) {
        return indexMap.entrySet().stream()
                .filter(entry -> min == entry.getValue())
                .map(Map.Entry::getKey)
                .toArray(String[]::new);
    }

}
