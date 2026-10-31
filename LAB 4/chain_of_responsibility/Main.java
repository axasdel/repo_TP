package chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();

        handlerA.setNextHandler(handlerB);

        handlerA.handleRequest(new Request(RequestType.TYPE_A));
        handlerA.handleRequest(new Request(RequestType.TYPE_B));

        try {
            handlerA.handleRequest(new Request(RequestType.TYPE_C));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}