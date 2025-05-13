public class Trivella extends Arm {

    public Trivella(String side) {    
        super(side);
    }    

    @Override
    public void attack() {
        System.out.println("Trivella attack " + this.side + "!\n");
    }

}
