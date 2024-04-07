package Logger;

public class InfoLogProcessor extends LoggerProcessor {

    public InfoLogProcessor(LoggerProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    public void log(LogLevel logLevel, String message) {
        if (logLevel == LogLevel.INFO) {
            System.out.println(message);
        } else {
            super.log(logLevel, message);
        }
    }
}
