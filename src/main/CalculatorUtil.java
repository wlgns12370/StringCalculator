package src.main;

public class CalculatorUtil {

    public static boolean isNegative(final Integer num) {
        if (num < 0) {
            return true;
        }
        return false;
    }

    public static boolean checkPattern(final String input) {
        if (input.length() < 7) {
            return false;
        }
        return input.charAt(0) == '/' &&
                input.charAt(1) == '/' &&
                input.charAt(3) == '\\' &&
                input.charAt(4) == 'n';
    }
}
