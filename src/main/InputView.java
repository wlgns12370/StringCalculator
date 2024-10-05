package src.main;

import java.util.Scanner;

public class InputView {
    private final Scanner sc;

    public InputView(Scanner sc) {
        this.sc = sc;
    }

    public String input() {
        String data = removeQuotes(sc.nextLine());
        sc.close();
        return data;
    }

    private String removeQuotes(String data) {
        if (data.startsWith("\"") && data.endsWith("\"")) {
            return data.substring(1, data.length()-1);
        }
        return data;
    }
}
