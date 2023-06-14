public class NumberFun {
  public static long findNextSquare(long n) {
      long x;
      long y;
      if (Math.sqrt(n) % 1 == 0) {
        x = (long) Math.sqrt(n);
        y = x + 1;
        return(y*y);
      } 
      else {
            return(-1);
        }
  }
}
