public class Solution{
  public static long sumCubes(long n){
    long sum = 0;
    for(long i = 0 ; i <= n ; ++i){
      sum += i*i*i;
    }
    return sum;
  }
}
