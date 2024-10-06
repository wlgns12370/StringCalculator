package src.main.model;

import src.main.DataSeparatorDto;

public class SeparatorUtil {

    public static DataSeparatorDto determineSeparator(final String input) {
        if (checkPattern(input)) {
            return new DataSeparatorDto(input.substring(5), input.substring(2, 3)); // 사용자 정의 구분자
        }
        return new DataSeparatorDto(input, "[,:]"); // 기본 구분자
    }

    private static boolean checkPattern(final String input) {
        if (input.length() < 5) {
            return false;
        }
        return input.charAt(0) == '/' &&
                input.charAt(1) == '/' &&
                input.charAt(3) == '\\' &&
                input.charAt(4) == 'n';
    }
}
