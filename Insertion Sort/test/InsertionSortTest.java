import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class InsertionSortTest {

    @Test
    public void testSort() {
        int[] given = {4,2,3,1,6,5};
        int[] expected = {1,2,3,4,5,6};
        assertTrue(Arrays.equals(expected, InsertionSort.sort(given)));
    }
}
