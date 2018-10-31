import java.util.List;

/**
 * Created by anton on 18/4/18.
 */
public class _93RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        Long l = Long.valueOf(s);
        int length = s.length();
        return restoreIpAddresses(s, 0, 1);
    }

    public List<String> restoreIpAddresses(String s, int start, int number) {
        if (number < 4) {
            if (start < s.length() - 1) {
                for (int i = 1; i <=3; i++) {
                    //if
                }
            }
        }
        return null;
    }
}
