package factorymethod;
public class TestFactoryMethod {
    public static void main(String[] args) {
        /*LoggerFactory filefact = new FileLoggerFactory();
        filefact.logMessage("Hi from file");

        LoggerFactory consfact = new ConsoleLoggerFactory();
        consfact.logMessage("Hi from console");*/
        
        TransportFactory carFactory = new CarFactory();
        Transport car = carFactory.create();
        car.move();

        TransportFactory bikeFactory = new BikeFactory();
        bikeFactory.create().move(); 
        new CarFactory().create().move();
    }
}
