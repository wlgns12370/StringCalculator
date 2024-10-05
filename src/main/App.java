package src.main;

public class App {
    public static void main(String[] args) throws Exception{
        AppConfig config = new AppConfig();
        config.calculateController().run();
    }
}