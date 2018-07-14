import java.util.List;

public class PaginationHelper<I> {
    List<I> collection;
    int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return itemCount() / itemsPerPage + (itemCount() % itemsPerPage > 0 ? 1 : 0);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        int zeroIndexedPageCount = pageCount() - 1;

        if (pageIndex > zeroIndexedPageCount) {
            return -1;
        }

        if (zeroIndexedPageCount > pageIndex) {
            return itemsPerPage;
        }



        return itemCount() % itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex + 1 > itemCount() || itemIndex < 0) {
            return -1;
        }

        if (itemIndex == 0 && itemCount() > 0) {
            return 0;
        }

        int index = itemIndex / itemsPerPage;
        return itemIndex % itemsPerPage > 0 ? index : index - 1;
    }
}
