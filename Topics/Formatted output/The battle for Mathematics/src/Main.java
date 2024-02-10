import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        double pi = Math.PI;
        //write your code below
        String formattedPi = "%.3f".formatted(pi);
        System.out.println(formattedPi);

    }
}