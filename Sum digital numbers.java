public class DRoot {
  static int dig_root(int n){
        int root = 0;
        while (n > 0 || root > 9) {
            if (n == 0) {
                n = root;
                root = 0;
            }
            root += n % 10;
            n /= 10;
        }
        return root;
    }
  public static int digital_root(int n) {
    return dig_root(n);
  }
}
