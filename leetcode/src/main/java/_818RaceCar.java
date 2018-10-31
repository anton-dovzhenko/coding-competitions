/**
 * Created by anton on 14/10/18.
 */
public class _818RaceCar {

    public int racecar(int target) {
        if (target % 2 == 0) {
            return 2 * racecar(target / 2);
        }
        int count = -1;
        boolean x = false;
        String binary = Integer.toBinaryString(target);
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1' && !x) {
                count += binary.length() - i + 1;
                x = true;
            } else if (binary.charAt(i) == '0' && x) {
                count += 1 + binary.length() - i;
                x = false;
            }
        }
        return count;
    }

}
