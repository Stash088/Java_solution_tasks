import java.util.*;
import java.util.Arrays;

public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        sum1 = Arrays.stream(arr1).sum();
        sum2 = Arrays.stream(arr2).sum();
        return sum1 + sum2;
  }

}
