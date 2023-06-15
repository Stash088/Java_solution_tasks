public class Solution {
  public int solution(int number) {
    int sum1 = 0;
    for(int i = 0 ;i < number ; ++i){
      if(i % 3 == 0 | i % 5 == 0){
        sum1 += i;
      }
      }
        return sum1;
  }
}
