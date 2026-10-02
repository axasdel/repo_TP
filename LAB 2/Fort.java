public class Fort extends Building implements Attacker {
    public Fort(int id, String name, int x, int y) {
        super(id, name, x, y);
    }

    @Override 
    public void attack(Unit unit) {
        unit.receiveDamage(1000);
    }
}