public class Main {
    public static void main(String[] args) {
        Singleton sing1 = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance();

        System.out.println(sing1 == sing2);

        sing1.testMethod();
    }
}