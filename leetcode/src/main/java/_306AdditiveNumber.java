
public class _306AdditiveNumber {

    public boolean isAdditiveNumber(String num) {

        for (int i = 1; i < 2 + num.length() / 3; i++) {
            long n1 = Long.valueOf(num.substring(0, i));
            for (int j = i + 1; j < 2 + 2 * num.length() / 3; j++) {
                long n2 = Long.valueOf(num.substring(i, j));
                if (isAdditiveNumber(num, n1, n2, j)) {
                    return true;
                }
                if (num.charAt(i) == '0') {
                    break;
                }
            }
            if (num.charAt(0) == '0') {
                break;
            }
        }
        return false;
    }

    private boolean isAdditiveNumber(String num, long n1, long n2, int offset) {
        long n3 = n1 + n2;
        String ns3 = Long.toString(n3);
        if (num.startsWith(ns3, offset)) {
            if (ns3.length() + offset == num.length()) {
                return true;
            } else {
                return isAdditiveNumber(num, n2, n3, offset + ns3.length());
            }
        }
        return false;
    }


}
