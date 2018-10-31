import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by anton on 12/2/17.
 */
public class _22GenerateParentheses {

//    public List<String> generateParenthesis(int n) {
//        List<String> result = new LinkedList<>();
//        result.add("()");
//        for (int i = 1; i < n; i++) {
//            result = generateParenthesis(result);
//        }
//        return result;
//    }
//
//    private List<String> generateParenthesis(List<String> list) {
//        List<String> result = new LinkedList<>();
//        for (String item : list) {
//            for (int i = 0; i < item.length(); i++) {
//                result.add(item.substring(0, i) + "()" + item.substring(i, item.length()));
//            }
//        }
//        return result;
//    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        Integer low = 0;
        Integer high = Integer.valueOf(multiply('1', n * 2), 2);
        for (Integer i = low; i <= high; i++) {
            String binary = Integer.toBinaryString(i);
            if (isValid(binary)) {
                result.add(convertToParenthesis(binary));
            }
        }
        return result;
    }

    private String multiply(char c, int n) {
        char[] array = new char[n];
        Arrays.fill(array, c);
        return new String(array);
    }

    private boolean isValid(String value) {
        int sum = 0;
        for (int i = 0; i < value.length(); i++) {
            sum += value.charAt(i) == '1' ? 1 : -1;
            if (sum < 0) {
                return false;
            }
        }
        return sum == 0;
    }

    private String convertToParenthesis(String value) {
        char[] array = new char[value.length()];
        for (int i = 0; i < value.length(); i++) {
            array[i] = value.charAt(i) == '1' ? '(' : ')';
        }
        return new String(array);
    }
}
/*

 ()
 ()()
 (())
 ()(())
 (()())
 ((()))
 (()())
 (())()
 */