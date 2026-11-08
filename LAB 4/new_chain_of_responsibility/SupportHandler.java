package new_chain_of_responsibility;

public interface SupportHandler {
    void setNext(SupportHandler next);
    void handle(SupportTicket ticket);
}