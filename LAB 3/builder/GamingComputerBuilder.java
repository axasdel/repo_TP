public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;
    
    public GamingComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public void buildCPU() { computer.setCPU("Intel core i5");}

    @Override 
    public void buildHDD() {computer.setHDD("1 TB SSD"); }

    @Override 
    public void buildRAM() { computer.setRAM("16 GB RAM");}

    @Override
    public Computer getResult() { return computer; }
}
