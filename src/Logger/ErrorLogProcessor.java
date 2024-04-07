package Logger;

public class ErrorLogProcessor extends LoggerProcessor {

    public ErrorLogProcessor(LoggerProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    public void log(LogLevel logLevel, String message) {
        if (logLevel == LogLevel.ERROR) {
            System.out.println(message);
        } else {
            super.log(logLevel, message);
        }
    }
}
