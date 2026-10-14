public class Computer {
    private String cpu;
    private String ram;
    private String hdd;

    public void setCPU(String cpu) { this.cpu = cpu; }

    public void setRAM(String ram) { this.ram = ram; }

    public void setHDD(String hdd) { this.hdd = hdd; }

    @Override
    public String toString() {
        return "Computer: cpu - " + cpu + ", ram - " + ram + ", hdd - " + hdd;
    }

}