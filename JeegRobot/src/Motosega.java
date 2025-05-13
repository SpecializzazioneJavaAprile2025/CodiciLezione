public class Motosega extends Arm{

    public Motosega(String side) {
        super(side);
    }

    @Override
    public void attack() {
        System.out.println("Motosega attack " + this.side + "!\n");
    }

}
