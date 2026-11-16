package adapter;

public class Main {
    public static void main(String[] args) {
        OldFahrenheitSensor oldSensor = new OldFahrenheitSensor();
        TemperatureSensor sensor = new SensorAdapter(oldSensor);

        System.out.printf("датчик (F): %.1f%n", oldSensor.getFahrenheit());
        System.out.printf("датчик (C): %.1f%n", sensor.getCelsius());
    }
}