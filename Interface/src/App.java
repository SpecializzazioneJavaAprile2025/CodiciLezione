public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        Player p1 = new Player("P1", 100);
        Player p2 = new Player("P2", 100);

        Enemy e1 = new Enemy("E1", 100);
        Enemy e2 = new Enemy("E2", 100);

        p1.attack();
        e1.moveBackward();

    }
}
