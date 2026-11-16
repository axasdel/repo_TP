package adapter;

class SensorAdapter implements TemperatureSensor {
    private OldFahrenheitSensor oldSensor;

    SensorAdapter(OldFahrenheitSensor oldSensor) {
        this.oldSensor = oldSensor;
    }

    @Override
    public double getCelsius() {
        return (oldSensor.getFahrenheit() - 32) * 5 / 9;
    }
}