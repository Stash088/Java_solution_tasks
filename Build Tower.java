public class Kata {
  
  public static String[] TowerBuilder(int n) {
    String t[] = new String[n], e;
    
    for (int i = 0; i < n; i++)
      t[i] = (e = " ".repeat(n-i-1)) + "*".repeat(i+i+1) + e;
    
    return t;
  }
  
}
