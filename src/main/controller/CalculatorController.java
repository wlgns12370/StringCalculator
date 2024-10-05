package src.main.controller;

import static src.main.CalculatorUtil.createNumberList;
import static src.main.CalculatorUtil.determineSeparator;

import src.main.model.NumberList;
import src.main.view.InputView;
import src.main.view.OutputView;

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
}
