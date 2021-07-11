package ex4;
import java.util.concurrent.Callable;

public class Main extends PlayerGeneratorTask {
    public static void main(String[] args) {
        PlayerGeneratorTask thread = new PlayerGeneratorTask();
        thread.call();
    }
}
