public interface ComputerBuilder {
    void buildCPU();
    void buildRAM();
    void buildHDD();

    Computer getResult();
}
