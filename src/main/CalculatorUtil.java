package src.main;

import src.main.model.NumberList;

public class CalculatorUtil {

    private static boolean checkPattern(final String input) {
        if (input.length() < 7) {
            return false;
        }
        return input.charAt(0) == '/' &&
                input.charAt(1) == '/' &&
                input.charAt(3) == '\\' &&
                input.charAt(4) == 'n';
    }

    public static String determineSeparator(final String inputData) {
        if (checkPattern(inputData)) {
            return inputData.substring(2, 3); // 사용자 정의 구분자
        } else {
            return "[,:]"; // 기본 구분자
        }
    }
    
    public static NumberList createNumberList(String inputData, final String separator) {
        if (checkPattern(inputData)) {
            inputData = inputData.substring(5);
        }
        return NumberList.of(inputData, separator);
    }
}
