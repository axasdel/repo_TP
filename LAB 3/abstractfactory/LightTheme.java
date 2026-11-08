package abstractfactory;
class LightTheme implements ThemeFactory {
    public Button createButton() { return new LightButton(); }
    public Input  createInput()  { return new LightInput(); }
}