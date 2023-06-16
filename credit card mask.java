public class Maskify {
    public static String maskify(String str) {
        return "#".repeat(Math.max(0, str.length() - 4)) +
                str.substring(Math.max(0, str.length() - 4));
    }
}
