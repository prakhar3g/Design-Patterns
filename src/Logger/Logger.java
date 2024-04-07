package Logger;

public class Logger {

    private LoggerProcessor loggerProcessor;

    public Logger() {
        loggerProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
    }

    public void log(LogLevel logLevel,String message){
        loggerProcessor.log(logLevel,message);
    }
}
