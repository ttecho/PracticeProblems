import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kata {
    public static long nextSmaller(long n) {
        System.out.println("Input: " + n);

        if (n > 9) {
            char[] chars = String.valueOf(n).toCharArray();
            for (int i = 1; i < chars.length; i++) {
                // Find index 1 digit
                int maxValue = chars[i];

                // Find index 2-size digit that is smaller than second index, but larger than all others
                char[] chars1 = Arrays.copyOfRange(chars, i + 1, chars.length);

                if (chars1.length == 0) {
                    break;
                }

                System.out.println(String.valueOf(chars));
                int nextSmallIndex = findSmallerButLargest(maxValue, chars1);

                if (nextSmallIndex == -1) {
                    break;
                }
                // Swap
                char[] swapped = swap(chars, i, nextSmallIndex);

                // Reorder all remaining numbers in desc
                List reordered = reorderDescFromStartIndex(nextSmallIndex + 1, swapped);

                return Long.parseLong(String.valueOf(reordered.toArray()));
            }
        }

        return -1;
    }

    public static final char[] swap (char[] chars, int i, int j) {
        char[] charsCopy = Arrays.copyOfRange(chars, 0, chars.length);

        char t = charsCopy[i];
        charsCopy[i] = charsCopy[j];
        charsCopy[j] = t;

        return charsCopy;
    }

    private static int findSmallerButLargest(int max, char[] longs) {
        System.out.println("Max value: " + max);
        System.out.println("List passed in: " + String.valueOf(longs));
        int tmp = -1;
        int winningIndex = -1;
        for(int i = 0; i < longs.length; i++) {
            if (longs[i] != max && longs[i] > tmp) {
                tmp = longs[i];
                winningIndex = i;
            }
        }
        return winningIndex;
    }

    private static List reorderDescFromStartIndex(int start, char[] chars) {
        System.out.println("Start index: " + start);
        System.out.println("Start list: " + String.valueOf(chars));

//        Collections.sort(list.subList(start,list.size()));

        System.out.println("Reordered list: " + String.valueOf(chars));

        return Arrays.asList(chars);

    }

}
