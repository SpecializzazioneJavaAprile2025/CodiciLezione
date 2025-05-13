public class Enemy implements MoveSet {
    public String name;
    public int health;
    
    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void attack() {
        System.out.println("Attacking");
    }

    @Override
    public void moveBackward() {
        System.out.println( "Moving Backward");
    }

    @Override
    public void moveForward() {
        System.out.println( "Moving Forward");
    }

    @Override
    public void moveLeft() {
        System.out.println( "Moving Left");
    }

    @Override
    public void moveRight() {
        System.out.println( "Moving Right");
    }
}
