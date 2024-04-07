package Logger;

public class DebugLogProcessor extends LoggerProcessor{

    public DebugLogProcessor(LoggerProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    public void log(LogLevel logLevel, String message) {
        if (logLevel == LogLevel.DEBUG) {
            System.out.println(message);
        } else {
            super.log(logLevel,message);
        }
    }
}
