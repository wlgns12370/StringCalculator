package src.test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.Test;

import src.main.model.StringCalculator;

public class StringCalculatorTest {
    private StringCalculator cal;

    @Before
    public void setUp() {
        cal = new StringCalculator();
    }

    @Test
    public void null_값을_입력할_경우_0을_반환한다() {
        final String input = null;
        final Integer result = 0;
    
        Integer calculateSum = cal.calculateSum(input);

        System.out.printf("expectedValue : %d, actualValue : %d",result ,calculateSum);
        assertEquals(result, calculateSum);
    }

    @Test
    public void 공백을_입력할_경우_0을_반환한다() {
        final String input = "";
        final Integer result = 0;
    
        Integer calculateSum = cal.calculateSum(input);

        System.out.printf("expectedValue : %d, actualValue : %d",result ,calculateSum);
        assertEquals(result, calculateSum);
    }

    @Test
    public void 숫자_하나를_문자열로_입력할_경우_해당_숫자를_반환한다() {
        final String input = "1";
        final Integer result = 1;
    
        Integer calculateSum = cal.calculateSum(input);

        System.out.printf("expectedValue : %d, actualValue : %d",result ,calculateSum);
        assertEquals(result, calculateSum);
    }

    @Test
    public void 숫자_두개를_쉼표_구분자로_입력할_경우_두_숫자의_합을_반환한다() {
        final String input = "1,2";
        final Integer result = 3;
    
        Integer calculateSum = cal.calculateSum(input);

        System.out.printf("expectedValue : %d, actualValue : %d",result ,calculateSum);
        assertEquals(result, calculateSum);
    }

    @Test
    public void 문자_사이에_커스텀_구분자를_지정할_수_있다() {
        final String input = "//;\\n" + "1;2;3";
        final Integer result = 6;
    
        Integer calculateSum = cal.calculateSum(input);

        System.out.printf("expectedValue : %d, actualValue : %d",result ,calculateSum);
        assertEquals(result, calculateSum);
    }

    @Test
    public void 문자열_계산기에_음수를_전달하는_경우_RuntimeException_예외를_throw한다() throws Exception {
        final String input = "-1,2,-3";
        assertThrows(RuntimeException.class, () -> cal.calculateSum(input));
    }
}