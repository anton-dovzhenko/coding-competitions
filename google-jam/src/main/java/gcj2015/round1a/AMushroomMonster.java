package gcj2015.round1a;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by anton on 17/12/16.
 */
public class AMushroomMonster {

    public static void main(String ... args) throws IOException {
        try (InputStream in = AMushroomMonster.class.getResourceAsStream("/2015.round1a.A-large-practice.in")
             ; Scanner sc = new Scanner(in)){
            int cases = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < cases; i++) {
                sc.nextLine();
                String line = sc.nextLine();
                String[] mushrooms = line.split(" ");
                int[] mushroomsCount = new int[mushrooms.length];
                for (int j = 0; j < mushrooms.length; j++) {
                    mushroomsCount[j] = Integer.parseInt(mushrooms[j]);
                }
                int eaten1 = getEaten1(mushroomsCount);
                int eaten2 = getEaten2(mushroomsCount);
                System.out.println(String.format("Case #%1$d: %2$d %3$d", i + 1, eaten1, eaten2));
            }
        }
    }

    public static int getEaten1(int[] values) {
        int eaten = 0;
        int mushrooms = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < mushrooms) {
                eaten += mushrooms - values[i];
            }
            mushrooms = values[i];
        }
        return eaten;
    }

    public static int getEaten2(int[] values) {
        int eaten = 0;
        int eatSpeed = Integer.MIN_VALUE;
        for (int i = 0; i < values.length - 1; i++) {
            int diff = values[i] - values[i+1];
            int temp = diff > 0 ? diff : 0;
            if (temp > eatSpeed) {
                eatSpeed = temp;
            }
        }
        for (int i = 0; i < values.length - 1; i++) {
            eaten += Math.min(eatSpeed, values[i]);
        }
        return eaten;
    }
}
