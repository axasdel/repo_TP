public class Main {
    public static void main(String[] args) {
        Application app1 = new Application(new CertainFactory());
        app1.paint();

        Application app2 = new Application(new AnotherFactory());
        app2.paint();
    }
}
