public class Main {
    public static void main(String[] args) {
        LoggerFactory filefact = new FileLoggerFactory();
        filefact.logMessage("Hi from file");

        LoggerFactory consfact = new ConsoleLoggerFactory();
        consfact.logMessage("Hi from console");
    }    
}
