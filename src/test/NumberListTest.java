package src.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.main.model.NumberList;

import java.util.ArrayList;
import java.util.List;

public class NumberListTest {

    private final String input = "1,2,3,4";
    private final String separator = "[,:]";
    
    @Test
    public void testCalculateSum() {
        final Integer sum = 10;
        NumberList numberList = NumberList.of(input, separator);
    
        Integer calculateSum = numberList.calculateSum();

        System.out.printf("expectedValue : %d, actualValue : %d",sum ,calculateSum);
        assertEquals(sum, calculateSum);
    }

    @Test
    public void testOf() {
        final List<Integer> intList = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            intList.add(i);
        }

        NumberList numberList = NumberList.of(input, separator);

        for (int i = 0; i < 4; i++) {
            System.out.printf("expectedValue : %d, actualValue : %d\n",intList.get(i), numberList.getNumberList().get(i));
        }
        assertArrayEquals(intList.toArray(new Integer[0]), numberList.getNumberList().toArray(new Integer[0]));
    }
}
