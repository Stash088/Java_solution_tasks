import java.lang.Character;
public class CountingDuplicates {
  public static int duplicateCount(String text) {
    int result = 0;
    int count[] = new int[256];
    for(int i = 0; i < text.length(); ++i){
      count[Character.toLowerCase(text.charAt(i))]++;
      }
    for (int i = 0; i < 256; i++) {    
        if(count[i] > 1) {
          result++;
          }
        }
    return result;
  }
}
