package new_chain_of_responsibility;

public class SupportTicket {
    private int difficultyLevel;

    public SupportTicket(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }
}