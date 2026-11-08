package factorymethod;
class BikeFactory extends TransportFactory { Transport create() { return new Bike(); } }