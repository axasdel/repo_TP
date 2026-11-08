package new_chain_of_responsibility;

public class JuniorOperator implements SupportHandler {
    private SupportHandler next;

    @Override
    public void setNext(SupportHandler next) {
        this.next = next;
    }

    @Override
    public void handle(SupportTicket ticket) {
        if (ticket.getDifficultyLevel() == 1) {
            System.out.println("оператор решил проблему");
        } else if (next != null) {
            System.out.println("оператор не смог решить и передает инженеру");
            next.handle(ticket);
        } else {
            System.out.println("никто не смог решить проблему(");
        }
    }
}