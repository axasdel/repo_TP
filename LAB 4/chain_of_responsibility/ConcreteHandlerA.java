package chain_of_responsibility;

public class ConcreteHandlerA implements Handler {
    private Handler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE_A) {
            System.out.println("обработчик а взялся за запрос");
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