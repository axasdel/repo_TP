package new_chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        SupportHandler junior = new JuniorOperator();
        SupportHandler engineer = new SeniorEngineer();

        junior.setNext(engineer);

        junior.handle(new SupportTicket(1));
        junior.handle(new SupportTicket(2));
        junior.handle(new SupportTicket(3));
    }
}