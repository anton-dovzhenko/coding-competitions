import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _3295ReportSpamMessage {

    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> banned = new HashSet<>(Arrays.asList(bannedWords));
        int cnt = 0;
        for (String m : message) {
            cnt += banned.contains(m) ? 1 : 0;
            if (cnt == 2) {
                return true;
            }
        }
        return false;
    }

}
