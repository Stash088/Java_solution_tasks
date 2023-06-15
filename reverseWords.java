import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        System.out.println(Arrays.stream(original.split("(?<=\\s)|(?=\\s+)"))
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining()));
    }
}
