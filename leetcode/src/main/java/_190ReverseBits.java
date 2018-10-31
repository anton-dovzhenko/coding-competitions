/**
 * Created by anton on 7/10/17.
 */
public class _190ReverseBits {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
//        System.out.println("n = " + Integer.toBinaryString(n));
        int reversed = 0;
        for (int i = 0; i < 32; i++) {
            reversed = reversed << 1;
            reversed = reversed | (n & 1);
            n = n >>> 1;
        }
//        System.out.println("reversed = " + Integer.toBinaryString(reversed));
        return reversed;
    }

}

//  10100101000001111010011100
//  00111001011110000010100101