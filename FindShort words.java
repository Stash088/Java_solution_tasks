import java.util.*;

public class Kata {
    public static int findShort(String s) {
      String[] words = s.split(" ");
        String shortest = Arrays.asList(words).stream().sorted((e2, e1) -> e1.length() > e2.length() ? -1 : 1).findFirst().get();
        return shortest.length();
    }
}
