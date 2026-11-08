package abstractfactory;
class DarkTheme implements ThemeFactory {
    public Button createButton() { return new DarkButton(); }
    public Input  createInput()  { return new DarkInput(); }
}