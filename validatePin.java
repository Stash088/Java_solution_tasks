public class Solution {

  public static boolean validatePin(String pin) {
    String regex = "\\d+";;
        if(pin.length() == 4 | pin.length() == 6) {
            if (pin.matches(regex) == true) {
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }
  }

}
