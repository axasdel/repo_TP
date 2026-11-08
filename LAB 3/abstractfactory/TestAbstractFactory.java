package abstractfactory;
public class TestAbstractFactory {
    public static void main(String[] args) {
        ThemeFactory theme = new DarkTheme();
        theme.createButton().draw();
        theme.createInput().draw();
    }
}
