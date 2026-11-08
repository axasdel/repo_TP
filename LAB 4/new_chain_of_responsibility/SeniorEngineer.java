package new_chain_of_responsibility;

public class SeniorEngineer implements SupportHandler {
    private SupportHandler next;

    @Override
    public void setNext(SupportHandler next) {
        this.next = next;
    }

    @Override
    public void handle(SupportTicket ticket) {
        if (ticket.getDifficultyLevel() == 2) {
            System.out.println("инженер решил проблему");
        } else if (next != null) {
            System.out.println("инженер не смог решить и передает архитектору");
            next.handle(ticket);
        } else {
            System.out.println("никто не смог решить проблему(");
        }
    }
}