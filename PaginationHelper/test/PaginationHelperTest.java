import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.Arrays;

public class PaginationHelperTest {
    @Test
    public void testItemCount() {
        PaginationHelper helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        assertEquals(6, helper.itemCount()); //should == 6
    }

    @Test
    public void testPageCount() {
        PaginationHelper helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        assertEquals(2, helper.pageCount());
    }

    @Test
    public void testPageItemCount() {
        PaginationHelper helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        assertEquals(2, helper.pageItemCount(1)); // last page - should == 2
        assertEquals(4, helper.pageItemCount(0)); //should == 4
        assertEquals(-1, helper.pageItemCount(2)); // should == -1 since the page is invalid
    }

    @Test
    public void testPageIndex() {
        PaginationHelper helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        assertEquals(1, helper.pageIndex(5)); //should == 1 (zero based index)
        assertEquals(0, helper.pageIndex(2)); //should == 0
        assertEquals(-1, helper.pageIndex(20)); //should == -1
        assertEquals(-1, helper.pageIndex(-10)); //should == -1

        assertEquals(0, helper.pageIndex(0)); //should == 0
    }
}
