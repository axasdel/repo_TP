package chain_of_responsibility;

public interface Handler {
    void handleRequest(Request request);
    void setNextHandler(Handler nextHandler);
}