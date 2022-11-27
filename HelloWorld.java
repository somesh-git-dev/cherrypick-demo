import java.util.Locale;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.printf("hello");

        String str = somesh("str");

    }

    private static String somesh(String str) {
        return str.toLowerCase(Locale.ROOT);
    }


}
