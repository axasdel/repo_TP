package chain_of_responsibility;

public class ConcreteHandlerB implements Handler {
    private Handler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE_B) {
            System.out.println("обработчик б взялся за запрос");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            throw new IllegalArgumentException("запрос " + request.getType() + " не обработан, это конец цепочки");
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}