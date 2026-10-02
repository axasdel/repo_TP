public class Unit extends GameObject {
    private boolean alive;
    private float hp;

    public Unit(int id, String name, int x, int y, float hp) {
        super(id, name, x, y); // вызов конструктора родителя
        this.hp = hp;
        this.alive = true;

    }

    public boolean isAlive() { return alive; }

    public float getHp() { return hp; }

    public void receiveDamage(float damage) {
        this.hp -= damage;

        if (this.hp <= 0) { this.alive = false; }
    }
}