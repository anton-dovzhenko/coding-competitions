package gcj2015.round1a;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 17/12/16.
 */
public class AMushroomMonsterTest {

    @Test
     public void testGetEaten1() throws Exception {
        assertEquals(15, AMushroomMonster.getEaten1(new int[]{10, 5, 15, 5}));
        assertEquals(0, AMushroomMonster.getEaten1(new int[]{100, 100}));
        assertEquals(81, AMushroomMonster.getEaten1(new int[]{81, 81, 81, 81, 81, 81, 81, 0}));
        assertEquals(181, AMushroomMonster.getEaten1(new int[]{23, 90, 40, 0, 100, 9}));
    }

    @Test
    public void testGetEaten2() throws Exception {
        assertEquals(25, AMushroomMonster.getEaten2(new int[]{10, 5, 15, 5}));
        assertEquals(0, AMushroomMonster.getEaten2(new int[]{100, 100}));
        assertEquals(567, AMushroomMonster.getEaten2(new int[]{81, 81, 81, 81, 81, 81, 81, 0}));
        assertEquals(244, AMushroomMonster.getEaten2(new int[]{23, 90, 40, 0, 100, 9}));
    }
}