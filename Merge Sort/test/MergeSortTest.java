import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class MergeSortTest {

    @Test
    public void testSort() {
        int[] given = {2,4,1,6,8,5,3,7};
        int[] expected = {1,2,3,4,5,6,7,8};
        assertTrue(Arrays.equals(expected, MergeSort.sort(given)));
    }
}
