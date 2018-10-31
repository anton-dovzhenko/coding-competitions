import java.util.ArrayList;
import java.util.List;

/**
 * Created by anton on 1/2/17.
 */
public class _412FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            String s = "";
            boolean fizzBuzz = false;
            if (i % 3 == 0) {
                s += "Fizz";
                fizzBuzz = true;
            }
            if (i % 5 == 0) {
                s += "Buzz";
                fizzBuzz = true;
            }
            if (!fizzBuzz) {
                s += i;
            }
            list.add(s);
        }
        return list;
    }

    public List<String> fizzBuzz2(int n) {
        List<String> list = new ArrayList<>(n);
        String fizz = "Fizz";
        String buzz = "Buzz";
        String fizzBuzz = "FizzBuzz";
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                list.add(fizzBuzz);
            } else if (i % 3 == 0) {
                list.add(fizz);
            } else if (i % 5 == 0) {
                list.add(buzz);
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }

}
