import java.util.List;

public class SmileFacesAlternate {
    public static int countSmileys(List<String> arr) {
        return (int) arr.stream().filter(x -> x.matches("[:;][-~]?[)D]")).count();
    }
}
