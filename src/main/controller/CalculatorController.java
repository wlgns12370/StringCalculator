package src.main.controller;

import src.main.model.StringCalculator;
import src.main.view.InputView;
import src.main.view.OutputView;

public class CalculatorController {
    private final InputView inputView;
    private final OutputView outputView;
    private final StringCalculator stringCalculator;

    public CalculatorController(final InputView inputView, final OutputView outputView, final StringCalculator stringCalculator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.stringCalculator = stringCalculator;
    }

    public void run() {
        String inputData = inputView.input();
        outputView.view(stringCalculator.calculateSum(inputData));
        return;
    }
}
