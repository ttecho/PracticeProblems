import java.util.*;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        List<Character> validEyes = Arrays.asList(':', ';');
        List<Character> validNoses = Arrays.asList('-', '~');
        List<Character> validMouths = Arrays.asList(')', 'D');

        int count = 0;
        for (String smile : arr) {
            char[] potentialSmile = smile.toCharArray();
            if (potentialSmile.length == 2) {
                count += (validEyes.contains(potentialSmile[0])
                        && validMouths.contains(potentialSmile[1])) ? 1 : 0;
            } else if (potentialSmile.length == 3) {
                count += (validEyes.contains(potentialSmile[0])
                        && validNoses.contains(potentialSmile[1])
                        && validMouths.contains(potentialSmile[2])) ? 1 : 0;
            }
        }
        return count;
    }
}
