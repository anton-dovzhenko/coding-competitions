import java.util.HashMap;
import java.util.Map;

/**
 * Created by anton on 15/7/17.
 */
public class AllOne {

    private Map<String, Integer> keys = new HashMap<>();

    /** Initialize your data structure here. */
    public AllOne() {

    }

    /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(String key) {
        keys.put(key, keys.getOrDefault(key, 0) + 1);
    }

    /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(String key) {
        Integer value = keys.get(key);
        if (value != null) {
            if (value == 1) {
                keys.remove(key);
            } else {
                keys.put(key, value - 1);
            }

        }
    }

    /** Returns one of the keys with maximal value. */
    public String getMaxKey() {
        Integer value = null;
        String key = "";
        for (Map.Entry<String, Integer> entry : keys.entrySet()) {
            if (value == null || value < entry.getValue()) {
                value = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
    }

    /** Returns one of the keys with Minimal value. */
    public String getMinKey() {
        Integer value = null;
        String key = "";
        for (Map.Entry<String, Integer> entry : keys.entrySet()) {
            if (value == null || value > entry.getValue()) {
                value = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
    }

}
