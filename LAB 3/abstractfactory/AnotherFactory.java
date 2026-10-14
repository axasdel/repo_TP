public class AnotherFactory implements GUIFactory {
    @Override 
    public Button createButton() {
        return new AnotherButton();
    }

    @Override 
    public Checkbox createCheckbox() {
        return new AnotherCheckbox();
    }
}

