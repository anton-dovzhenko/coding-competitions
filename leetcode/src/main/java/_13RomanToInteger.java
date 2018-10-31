/**
 * Created by anton on 13/1/17.
 */
public class _13RomanToInteger {

    public int romanToInt(String s) {
        int value = 0;
        int lastDigit = 0;
        for (int i = s.length() - 1; i > -1; i--) {
            int digit = 1;
            switch (s.charAt(i)) {
                //case 'I':
                //    tempValue += 1;
                //    break;
                case 'V':
                    digit = 5;
                    break;
                case 'X':
                    digit = 10;
                    break;
                case 'L':
                    digit = 50;
                    break;
                case 'C':
                    digit = 100;
                    break;
                case 'D':
                    digit = 500;
                    break;
                case 'M':
                    digit = 1000;
                    break;
            }
            if (digit < lastDigit) {
                value = value - digit;
            } else {
                value = value + digit;
            }
            lastDigit = digit;
        }
        return value;
    }

}
