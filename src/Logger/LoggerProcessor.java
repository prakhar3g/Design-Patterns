package Logger;

public abstract class LoggerProcessor {

    private LoggerProcessor nextLoggerProcessor;

    public LoggerProcessor(LoggerProcessor loggerProcessor) {
        nextLoggerProcessor = loggerProcessor;
    }

    public void log(LogLevel logLevel, String message) {
        if (nextLoggerProcessor != null) {
            nextLoggerProcessor.log(logLevel, message);
        }
    }

}
