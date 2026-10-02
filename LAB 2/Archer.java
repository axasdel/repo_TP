public class Archer extends Unit implements Attacker, Moveable {
    public Archer(int id, String name, int x, int y, float hp) {
        super(id, name, x, y, hp);
    }

    @Override
    public void attack(Unit unit) {
        unit.receiveDamage(800);
    }

    @Override 
    public void move(int x, int y) {
        setX(x);
        setY(y);
    }
}