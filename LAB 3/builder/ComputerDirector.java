public class ComputerDirector {
    private ComputerBuilder compbuilder;

    public ComputerDirector(ComputerBuilder compbuilder) { this.compbuilder = compbuilder; }

    public void constructComputer() {
        compbuilder.buildCPU();
        compbuilder.buildRAM();
        compbuilder.buildHDD();
    }
}
