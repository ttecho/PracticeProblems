import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class BubbleSortTest {

    @Test
    public void testSortBasic() {
        int[] given = {4,2,3,1,6,5};
        int[] expected = {1,2,3,4,5,6};
        assertTrue(Arrays.equals(expected, BubbleSort.sortBasic(given)));
    }

    @Test
    public void testSortMoreEfficient() {
        int[] given = {4,2,3,1,6,5};
        int[] expected = {1,2,3,4,5,6};
        assertTrue(Arrays.equals(expected, BubbleSort.sortMoreEfficient(given)));
    }

    @Test
    public void testSortMostEfficient() {
        int[] given = {4,2,3,1,6,5};
        int[] expected = {1,2,3,4,5,6};
        assertTrue(Arrays.equals(expected, BubbleSort.sortMostEfficient(given)));
    }
}
