public class GameObject {
    private int id, x, y;  // поля
    private String name;

    // конструктор
    public GameObject(int id, String name, int x, int y) {
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
    }

    // геттеры
    public int getId() { return id; }

    public String getName() { return name; }

    public int getX() { return x; }
    public int getY() { return y; }

    // сеттеры для изменения координат
    public void setX(int x) {this.x = x; }
    public void setY(int y) { this.y = y; }
}

