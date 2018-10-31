import java.util.Arrays;

/**
 * Created by anton on 6/5/18.
 */
public class _831MaskingPersonalInformation {

    public String maskPII(String S) {
        int index = S.indexOf('@');
        if (index >= 0) {
            S = S.toLowerCase();
            return S.charAt(0) + "*****" + S.charAt(index - 1) + S.substring(index);
        } else {
            int  digitCount = 0;
            String openDigits = "";
            for (int i = S.length() - 1; i >= 0; i--) {
                char c = S.charAt(i);
                if (Character.isDigit(c)) {
                    if (digitCount < 4) {
                        openDigits = c + openDigits;
                    }
                    digitCount++;
                }
            }
            openDigits = "***-***-" + openDigits;
            if (digitCount > 10) {
                char[] countryCode = new char[digitCount - 10];
                Arrays.fill(countryCode, '*');
                openDigits = "+" + new String(countryCode) + "-" + openDigits;
            }
            return openDigits;
        }
    }

}
