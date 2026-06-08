public class _3954SumOfCompatibleNumbersinRangeI {

    public int sumOfGoodIntegers(int n, int k) {
        int sum = 0;
        for (int x = n - k; x <= n + k; x++) {
            if ((n & x) == 0 && x > 0) {
                System.out.println(x);
                sum += x;
            }
        }
        return sum;
    }

    public static void main(String ... args) {
        System.out.println(new _3954SumOfCompatibleNumbersinRangeI().sumOfGoodIntegers(1, 13));
    }

}
