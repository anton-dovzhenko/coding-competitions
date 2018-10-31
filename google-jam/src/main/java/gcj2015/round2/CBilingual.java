package gcj2015.round2;

import java.util.Set;
import java.util.concurrent.*;

/**
 * Created by anton on 26/12/16.
 */
public class CBilingual {

    public static int getSameWords(int N, Set<String> english, Set<String> french
            , String[][] sentences) {
        int sameCount = 0;
        for (String fr : french) {
            if (english.contains(fr)) {
                sameCount++;
            }
        }
        if (sentences != null) {
            boolean[][] language = new boolean[sentences.length][2];
            for (int i = 0; i < sentences.length; i++) {
                
            }
        }

        return sameCount;
    }

}
