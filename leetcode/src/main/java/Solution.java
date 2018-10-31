import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 * Created by anton on 10/6/18.
 */
public class Solution {

    static float[] CalculateMovingAverage(float[] ClosingPrices) {
        float[] mavg = new float[ClosingPrices.length];
        System.arraycopy(ClosingPrices, 0, mavg, 0, ClosingPrices.length);
        for (int i = 1; i < Math.min(mavg.length, 10); i++) {
            mavg[i] = (mavg[i - 1] * i + mavg[i]) / (i + 1);
        }
        for (int i = 10; i < mavg.length; i++) {
            mavg[i] = (mavg[i - 1] * 10 - ClosingPrices[i - 10] + mavg[i]) / 10;
        }
        //I don't think this is necessary, but it is required to pass the test
        for (int i = 0; i < mavg.length; i++) {
            mavg[i] = Math.round(mavg[i] * 100) / 100f;
        }
        return mavg;
    }

//[125.0, 124.61, 124.88999, 124.947495, 125.257996, 125.31167, 125.351425, 125.38124, 125.7111
// , 125.72899, 125.761986, 125.71999, 125.55501, 125.79201, 126.08301, 126.70601, 127.254005
// , 127.79, 127.94401, 128.405]




    public static void main(String[] args) throws IOException{
        float[] closingPrices = new float[] {125f,124.22f,125.45f,125.12f,126.5f,125.58f,125.59f,125.59f,128.35f,125.89f,125.33f,123.8f,123.8f,127.49f,129.41f,131.81f,131.07f,130.95f,129.89f,130.5f};
        System.out.println(Arrays.toString(Solution.CalculateMovingAverage(closingPrices)));
        //        Scanner in = new Scanner(System.in);
//        final String fileName = System.getenv("OUTPUT_PATH");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
//        float[] res;
//
//        int _ClosingPrices_size = 0;
//        _ClosingPrices_size = Integer.parseInt(in.nextLine().trim());
//        float[] _ClosingPrices = new float[_ClosingPrices_size];
//        float _ClosingPrices_item;
//        for(int _ClosingPrices_i = 0; _ClosingPrices_i < _ClosingPrices_size; _ClosingPrices_i++) {
//            _ClosingPrices_item = Float.parseFloat(in.nextLine().trim());
//            _ClosingPrices[_ClosingPrices_i] = _ClosingPrices_item;
//        }
//
//        res = CalculateMovingAverage(_ClosingPrices);
//        for(int res_i=0; res_i < res.length; res_i++) {
//            bw.write(String.valueOf(res[res_i]));
//            bw.newLine();
//        }
//
//        bw.close();
    }
}
