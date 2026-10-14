public class CertainFactory implements GUIFactory {
    @Override 
    public Button createButton() {
        return new CertainButton();
    }

    @Override 
    public Checkbox createCheckbox() {
        return new CertainCheckbox();
    }
}
