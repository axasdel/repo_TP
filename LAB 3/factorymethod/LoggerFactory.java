public abstract class LoggerFactory {
    public abstract Logger createLogger();

    public void logMessage(String message) {
        Logger logger1 = createLogger();
        logger1.log(message);
    }
}
