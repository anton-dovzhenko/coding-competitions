package gcj2015.round1b;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.log10;
import static java.lang.Math.pow;

/**
 * Created by anton on 19/12/16.
 */
public class ACounterCulture {

    public static void main(String ... args) throws IOException {
        getCounter(1101);
//        System.out.println(getDigitSum(5));
//        System.out.println(getDigitSum(10));
//        System.out.println(getDigitSum(11));
//        System.out.println(getDigitSum(19));
//        System.out.println(getDigitSum(21));
//        System.out.println(getDigitSum(113));
//        System.out.println(pow(10, (int) log10(9)));
//        getCounter2(100);
        /*try (InputStream in = ACounterCulture.class.getResourceAsStream("/2015.round1b.A-small-practice.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                String line = sc.nextLine();
                int count = getCounter(Integer.parseInt(line));
                System.out.println(String.format("Case #%1$d: %2$d", i + 1, count));
            }
        }*/
    }

    public static int getCounter2(int N) {
        if (N < 10) {
            return N;
        }
        int counter = 10;
        int actions = 10;
        while (counter < N) {
            if (Integer.toString(counter).length() < Integer.toString(N).length()) {
                if (counter % 10 == 9) {
                    int newCounter = 9 * (int) pow(10, (int) log10(counter)) + counter / 10;
                    counter = newCounter == counter ? ++counter : newCounter;
                } else {
                    counter++;
                }
                actions++;
            } else {
                if (isZeroes(N)) {
                    actions = actions * (Integer.toString(N).charAt(0) - '0');
                } else {
                    actions = actions + getDigitSum(N) - 1;
                    actions += getFlipSum(N);
                }
                break;
            }
        }
        return actions;
    }

    private static boolean isZeroes(int value) {
        String number = Integer.toString(value);
        for (int i = 1; i < number.length(); i++) {
            if (number.charAt(i) != '0') {
                return false;
            }
        }
        return true;
    }

    private static int getDigitSum(int value) {
        int sum = 0;
        while (value > 0) {
            sum += value % 10;
            value = value / 10;
        }
        return sum;
    }

    private static int getFlipSum(int value) {
        int sum = 0;
        String number = Integer.toString(value);
        for (int i = 1; i < number.length() - 1; i++) {
            if (number.charAt(i) > '0') {
                sum++;
            }
        }
        if (number.charAt(0) != '1') {
            sum++;
        }
        return sum;
    }



    public static int getCounter(int N) {
        int count = 1;
        while (N > 1) {

            if (N % 10 > 0 && N > 100) {
                N--;
            } else {


                char[] array = Integer.toString(N).toCharArray();
                Arrays.sort(array);
                int zeroes = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == '0') {
                        zeroes++;
                    } else {
                        break;
                    }
                }
                if (zeroes > 0 && array.length > 2 && zeroes < array.length - 1) {
                    for (int i = 0; i < array.length - 1 - zeroes; i++) {
                        array[i] = array[i + zeroes];
                    }
                    for (int i = array.length - 1 - zeroes; i < array.length - 1; i++) {
                        array[i] = '0';
                    }
                }
                if (zeroes == array.length - 1) {
                    array[0] = array[array.length - 1];
                    array[array.length - 1] = '0';
                }
                int temp = Integer.parseInt(new String(array));
                if (temp < N) {
                    N = temp;
                } else {
                    N--;
                }
            }
            System.out.println(N);
            count++;
        }
        return count;

    }

}
