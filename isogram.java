import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Set<String> set = Stream.of(str.trim().split("(?!^)")) .collect(Collectors.toSet());
        if(str.length() == set.size()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
