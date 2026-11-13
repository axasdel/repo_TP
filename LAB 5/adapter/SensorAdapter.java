package adapter;

class SensorAdapter implements TemperatureSensor {
    private OldFahrenheitSensor old = new OldFahrenheitSensor();
    public double getCelsius() { return (old.getFahrenheit() - 32) * 5 / 9; }
}