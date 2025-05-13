public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println(" Hello, World! ");

        //Object composition
        JeegRobot j1 = new JeegRobot(new Trivella("Sx"), new Trivella("Dx"), new Tank());

        j1.attackDx();
        j1.attackSx();
        j1.move();


        JeegRobot j2 = new JeegRobot(new Motosega("Sx"), new Trivella("Dx"), new Tank());

        j2.attackDx();
        j2.attackSx();
        j2.move();
    }
}
