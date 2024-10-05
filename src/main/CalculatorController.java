package src.main;
import static src.main.CalculatorUtil.checkPattern;

public class CalculatorController {
    private final InputView inputView;
    private final OutputView outputView;

    public CalculatorController(final InputView inputView, final OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        String inputData = inputView.input();
        String separator = determineSeparator(inputData);
        NumberList numberList = createNumberList(inputData, separator);
        outputView.view(numberList.calculateSum());
        return;
    }

    private String determineSeparator(String inputData) {
        if (checkPattern(inputData)) {
            return inputData.substring(2, 3); // 사용자 정의 구분자
        } else {
            return "[,:]"; // 기본 구분자
        }
    }
    
    private NumberList createNumberList(String inputData, String separator) {
        if (checkPattern(inputData)) {
            inputData = inputData.substring(5);
        }
        return NumberList.of(inputData, separator);
    }
}
