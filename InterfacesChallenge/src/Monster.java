import java.util.ArrayList;
import java.util.List;

public class Monster implements Saveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0, name);
        values.add(1, Integer.toString(hitPoints));
        values.add(2, Integer.toString(strength));
        return values;
    }

    @Override
    public void read(List<String> savedVaules) {
        if (savedVaules != null && savedVaules.size() > 0) {
            name = savedVaules.get(0);
            hitPoints = Integer.parseInt(savedVaules.get(1));
            strength = Integer.parseInt(savedVaules.get(2));
        }
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
