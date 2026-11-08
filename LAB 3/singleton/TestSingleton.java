package singleton;
public class TestSingleton {
    public static void main(String[] args) {
        // Singleton.getInstance().testMethod();

        Settings.getInstance().getTheme();
        System.out.println(Settings.getInstance().getTheme());
    }
}