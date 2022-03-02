import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class _442FindAllDuplicatesinanArrayTest {

    @Test
    public void findDuplicates() {
        Assert.assertEquals(Arrays.asList(2, 3),
                new _442FindAllDuplicatesinanArray().findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        Assert.assertEquals(Collections.singletonList(1),
                new _442FindAllDuplicatesinanArray().findDuplicates(new int[]{1, 1, 2}));
        Assert.assertEquals(Collections.emptyList(),
                new _442FindAllDuplicatesinanArray().findDuplicates(new int[]{1}));
    }
}