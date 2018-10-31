/**
 * Created by anton on 13/1/17.
 */
public class _38CountAndSay {

    public String countAndSay(int n) {
        String result = "1";
        for (int i = 0; i < n - 1; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char last = result.charAt(result.length() - 1);
            for (int j = result.length() - 2; j > -1; j--) {
                char digit = result.charAt(j);
                if (digit != last) {
                    sb.append(last);
                    sb.append(count);
                    count = 1;
                } else {
                    count++;
                }
                last = digit;
            }
            sb.append(last);
            sb.append(count);
            result = sb.reverse().toString();
        }
        return result;
    }

}
