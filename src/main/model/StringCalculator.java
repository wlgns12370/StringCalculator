package src.main.model;

import static src.main.model.SeparatorUtil.determineSeparator;

import javax.management.RuntimeErrorException;

import src.main.DataSeparatorDto;

public class StringCalculator {

    public Integer calculateSum(final String input) {
        if (input == null || input.isBlank()) {
            return 0;
        }
        DataSeparatorDto dto = determineSeparator(input);
        final String[] splitString = dto.input().split(dto.separator());
        return sum(toInts(splitString));
    }

    private int[] toInts(String[] values) {
        int[] numberList = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            numberList[i] = checkNegative(Integer.parseInt(values[i]));
        }
        return numberList;
    }

    private int sum(int[] numberList) {
        int total = 0;
        for (int number : numberList) {
            total += number;
        }
        return total;
    }
    
    private int checkNegative(final int num) {
        if (isNegative(num)) {
            Error e = new Error("음수가 입력되었습니다.");    
            throw new RuntimeErrorException(e);
        }
        return num;
    }

    private boolean isNegative(final int num) {
        if (num < 0) {
            return true;
        }
        return false;
    }
}
