import java.util.ArrayList;
import java.util.List;

public class Player implements  Saveable {
    private String name;
    private int hitpoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitpoints, int strength) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, name);
        values.add(1, Integer.toString(hitpoints));
        values.add(2, Integer.toString(strength));
        values.add(3, weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            name = savedValues.get(0);
            hitpoints = Integer.parseInt(savedValues.get(1));
            strength = Integer.parseInt(savedValues.get(2));
            weapon = savedValues.get(3);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitpoints=" + hitpoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
