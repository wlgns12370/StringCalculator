package src.main;

import java.util.Scanner;

import src.main.controller.CalculatorController;
import src.main.view.InputView;
import src.main.view.OutputView;

public class AppConfig {

    public CalculatorController calculateController() {
        return new CalculatorController(inputView(), outputView());
    }

    private InputView inputView() {
        return new InputView(new Scanner(System.in));
    }

    private OutputView outputView() {
        return new OutputView();
    }
}