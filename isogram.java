import java.util.*;
import java.util.Arrays;

public class isogram {
    public static boolean  isIsogram(String str) {
        List<String> items = Arrays.asList(str.toLowerCase().split("(?!^)"));
        HashSet<String> countryHashSet = new HashSet<>();
        for(String i : items){
            countryHashSet.add(i);
        }
        if(items.size() == countryHashSet.size()){
            return true;
        }
        else{
            return false;
        }
    }
} 
