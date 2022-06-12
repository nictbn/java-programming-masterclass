public class Player {
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining() {
        return health;
    }
}
