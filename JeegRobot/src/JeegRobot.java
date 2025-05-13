public class JeegRobot {
    private Arm armSx;
    private Arm armDx;
    private Leg leg;

    //Dependency injection
    //Iniettare una dipendenza vuol dire che la classe dipende da altre classi e queste vengono soprattutto valorizzate nei costruttori
    //Il costruttore ha l'obbligo di essere public
    public JeegRobot(Arm armSx, Arm armDx, Leg leg) {
        this.armSx = armSx;
        this.armDx = armDx;
        this.leg = leg;
    }

    public void attackDx() {
        this.armDx.attack();
    }

    public void attackSx() {
        this.armSx.attack();
    }

    public void move() {
        this.leg.moveForward();
        this.leg.moveBackward();
    }

}
