public class Main {
    public static void main(String[] args) {
        Archer archer1 = new Archer(1, "эльф", 0, 0, 100);
        Archer archer2 = new Archer(4, "геральт", 22, 8, 100);
        Archer archer3 = new Archer(5, "бедолага", 3, 3, 100);

        Fort fort = new Fort(2, "Каэр Морхен", 10, 11);
        fort.attack(archer3);
        System.out.println("Hp бедолаги: " + archer3.getHp());

        MobileHome home = new MobileHome(3, "дом", 6, 7);

        archer2.attack(archer1);
        System.out.println("Hp эльфа: " + archer1.getHp());
        System.out.println("Эльф остался жив: " + archer1.isAlive());


        System.out.println("Координаты дома до перемещения: " + home.getX() + ", " + home.getY());
        home.move(148, 80);
        System.out.println("Координаты дома после перемещения: " + home.getX() + ", " + home.getY());

    }
}