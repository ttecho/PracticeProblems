import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Rank {

    public static String nthRank(String st, Integer[] weights, int n) {
        if (st.isEmpty()) {
            return "No participants";
        }

        String[] names = st.split(",");

        if (names.length < n) {
            return "Not enough participants";
        }

        System.out.println("Received:");
        System.out.println("st = " + st);
        System.out.print("weights = [");
        for(Integer w : weights) {
            System.out.print(w + ",");
        }
        System.out.println("]");
        System.out.println("n = " + n);

        Integer[] winningNumbers = getWinningNumbersForNames(names, weights);
        HashMap<Integer, List<String>> numToNameMap = getNumToNameMap(names, winningNumbers);

        return getWinner(winningNumbers, numToNameMap, n);

    }

    private static String getWinner(Integer[] winningNumbers, HashMap<Integer, List<String>> winningNumToNameMap, int n) {
        Arrays.sort(winningNumbers, Collections.reverseOrder());

        List<String> winners = winningNumToNameMap.get(winningNumbers[n - 1]);

        System.out.println("WINNERS PRE SORT : " + Arrays.toString(winners.toArray()));

        Collections.sort(winners);
        System.out.println("WINNERS POST SORT : " + Arrays.toString(winners.toArray()));

        return winners.get(0);
    }

    private static HashMap<Integer, List<String>> getNumToNameMap(String[] names, Integer[] winningNumbers) {
        HashMap<Integer, List<String>> numToNameMap = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            numToNameMap.computeIfAbsent(winningNumbers[i], k -> new ArrayList<>()).add(names[i]);
        }
        return numToNameMap;
    }

    private static Integer[] getWinningNumbersForNames(String[] names, Integer[] weights) {
        Integer[] winningNumbers = new Integer[names.length];
        for (int i = 0; i < names.length; i++) {
            winningNumbers[i] = calculateWinningNumber(names[i], weights[i]);
            System.out.println(names[i] + " " + winningNumbers[i]);
//            System.out.println("    Weight of : " + weights[i]);
//            System.out.println("    Winning Number : " + winningNumbers[i]);
        }
        return winningNumbers;
    }

    private static int calculateWinningNumber(String name, int weight) {
        return (name.length() + calculateNameValue(name)) * weight;
    }

    private static int calculateNameValue(String name) {
        return name.chars().map(c -> convertLetterToNumber((char) c)).sum();
    }

    private static int convertLetterToNumber(char c) {
        int intVersionASCII = (int) Character.toUpperCase(c);
        if (intVersionASCII <= 90 & intVersionASCII >= 65) {
            return intVersionASCII - 64;
        }
        return -1;
    }
}
