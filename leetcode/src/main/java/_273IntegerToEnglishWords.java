import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by anton on 28/3/17.
 */
public class _273IntegerToEnglishWords {

    private final String[] numMultipliers = {null, "Thousand", "Million", "Billion"};
    private final String[] ones = {null, "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen"
            , "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] tens = {null, null, "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        List<String> list = new ArrayList<>();
        int multIndex = 0;
        while (num > 0) {
            int temp = num % 1000;
            numToWordsBelow1000(temp, list, numMultipliers[multIndex]);
            num /= 1000;
            multIndex++;
        }
        return String.join(" ", list);
    }

    protected void numToWordsBelow1000(int num, List<String> list, String prefix) {
        if (num == 0) {
            return;
        }
        int _3digits = num / 100;
        int _2digits = num % 100;
        int _1digit = num % 10;
        if (prefix != null) {
            list.add(0, prefix);
        }
        if (_2digits < 20 && _2digits > 9) {
            list.add(0, teens[_2digits - 10]);
        } else if (_1digit > 0) {
            list.add(0, ones[_1digit]);
        }
        if (_2digits >= 20) {
            list.add(0, tens[_2digits / 10]);
        }
        if (_3digits > 0) {
            list.add(0, ones[_3digits] + " Hundred");
        }
    }

}
