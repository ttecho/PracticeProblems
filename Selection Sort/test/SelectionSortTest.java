import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void testSort() {
        int[] given = {4,2,3,1,5};
        int[] expected = {1,2,3,4,5};
        assertTrue(Arrays.equals(expected, SelectionSort.sort(given)));
    }
}
