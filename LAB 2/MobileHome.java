public class MobileHome extends Building implements Moveable {
    public MobileHome(int id, String name, int x, int y) {
        super(id, name, x, y);
    }

    @Override
    public void move(int x, int y) {
        setX(x);
        setY(y);
    }
}