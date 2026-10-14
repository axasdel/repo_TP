public class Main {
    public static void main(String[] args) {
        ComputerBuilder compbuilder = new GamingComputerBuilder();
        
        ComputerDirector direct = new ComputerDirector(compbuilder);
        direct.constructComputer();

        Computer comp = compbuilder.getResult();

        System.out.println(comp);
    }
}
