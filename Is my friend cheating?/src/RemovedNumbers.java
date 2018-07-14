import java.util.ArrayList;
import java.util.List;

public class RemovedNumbers {

	public static List<long[]> removNb(long n) {
		List<Long> list = createList(n);

		return null;
	}

	private static List<Long> createList(long n) {
        List<Long> theLongs = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            theLongs.add((long)i);
        }

        return theLongs;
	}



}
