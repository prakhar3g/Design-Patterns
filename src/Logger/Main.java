package Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log(LogLevel.DEBUG, "DEBUG");
        logger.log(LogLevel.ERROR, "ERROR");
        logger.log(LogLevel.INFO, "INFO");
    }
}
