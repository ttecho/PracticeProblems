import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

class RankAlternative {
    public static String nthRank(String st, Integer[] we, int n) {
        if(st.isEmpty()){
            return "No participants";
        } else {
            String[] names = st.split(",");
            String[] sorted= IntStream.range(0, names.length)
                    .boxed()
                    .sorted(Comparator.<Integer>comparingInt(i->getScore(i,names,we)).reversed().thenComparing(i->names[i]))
                    .map(i->names[i])
                    .toArray(String[]::new);
            return n <= sorted.length ? sorted[n-1] : "Not enough participants";
        }
    }

    private static int getScore(int i, String[] names, Integer[] we){
        return names[i].chars().map(c->Character.toUpperCase(c)-'A'+1).reduce(names[i].length(),Integer::sum) * we[i];
    }
}
