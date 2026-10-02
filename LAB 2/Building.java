public class Building extends GameObject {
    private boolean built;

    public Building(int id, String name, int x, int y) {
        super(id, name, x, y);

        built = false;
    }

    // геттер
    public boolean isBuilt() { return built; }

    // сеттер, чтобы значение можно было бы менять
    public void setBuilt(boolean built) { this.built = built; }
}