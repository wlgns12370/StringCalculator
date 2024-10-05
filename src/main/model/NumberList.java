package src.main.model;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class NumberList {
    private final List<Integer> numberList;

    private NumberList(final List<Integer> numberList) {
        this.numberList = numberList;
    }

    public static NumberList of(final String input, final String separator) {
        List<Integer> numberList = new ArrayList<>();
        if (input.isBlank()) {
            numberList.add(0);
            return new NumberList(numberList);
        }
        final String[] charNumberList = input.split(separator);
        for (String string : charNumberList) {
            Integer num = Integer.parseInt(string.trim());
            checkNonNegative(num);
            numberList.add(num);
        }
        return new NumberList(numberList);
    }
    
    private static void checkNonNegative(final Integer num) {
        if (isNegative(num)) {
            Error e = new Error("음수가 입력되었습니다.");    
            throw new RuntimeErrorException(e);
        }
    }

    private static boolean isNegative(final Integer num) {
        if (num < 0) {
            return true;
        }
        return false;
    }
    
    public Integer calculateSum() {
        Integer temp = 0;
        for (Integer integer : numberList) {
            temp += integer;
        }
        return temp;
    }

    public List<Integer> getNumberList() {
        return this.numberList;
    }
}
