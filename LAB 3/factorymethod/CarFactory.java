package factorymethod;
class CarFactory  extends TransportFactory { Transport create() { return new Car(); } }