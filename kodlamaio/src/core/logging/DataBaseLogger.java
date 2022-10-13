package core.logging;

public class DataBaseLogger implements ILogger{
    @Override
    public void log(String data) {
        System.out.println("Veri tabanına loglandı." + data);
    }
}
