public class Player implements MoveSet {
    
    private String name;
    private int score;
    
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void attack() {
        System.out.println("Attacking");
    }

    @Override
    public void moveBackward() {
        System.out.println("Moving Backward");
    }

    @Override
    public void moveForward() {
        System.out.println("Moving Forward");
    }

    @Override
    public void moveLeft() {
        System.out.println("Moving Left");
    }

    @Override
    public void moveRight() {
        System.out.println("Moving Right");
    }
}
