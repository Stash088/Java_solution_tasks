import java.util.*;

public class Kata {
  
  public static String plus(String a, String b) {
        int i = a.length();
        int j = b.length();
        int k = Math.max(i, j) + 1;
        char[] c = new char[k];
        for (int digit = 0; k > 0; digit /= 10) {
            if (i > 0)
                digit += a.charAt(--i) - '0';
            if (j > 0)
                digit += b.charAt(--j) - '0';
            c[--k] = (char) ('0' + digit % 10);
        }
        for (k = 0; k < c.length - 1 && c[k] == '0'; k++) {}
        return new String(c, k, c.length - k);
    }
  
  
  public static String add(String a, String b) {
    return plus(a,b);
}
}
