abstract class npc {
    private int health;
    private String map;
    private String weapon;

    public npc(int health, String map, String weapon) {
        if (health < 0 || health > 10) {
            throw new IllegalArgumentException("Health must be between 0 and 10");
        }
        this.health = health;
        this.map = map;
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public String getMap() {
        return map;
    }

    public String getWeapon() {
        return weapon;
    }

    public abstract void attack();
}

interface IProgress {
    void progressSaver();
}

class zombie extends npc implements IProgress {
    public zombie(int health, String map, String weapon) {
        super(health, map, weapon);
    }

    @Override
    public void attack() {
        System.out.println("Zombie eats your brains!");
    }

    @Override
    public void progressSaver() {
        System.out.println("Zombie's progress has been saved.");
    }
}

class mummy extends npc implements IProgress {
    public mummy(int health, String map, String weapon) {
        super(health, map, weapon);
    }

    @Override
    public void attack() {
        System.out.println("Mummy wraps you up in bandages!");
    }

    @Override
    public void progressSaver() {
        System.out.println("Mummy's progress has been saved.");
    }
}

public class game {
    public static void main(String[] args) {
        zombie zombie = new zombie(8, "Erangle", "Sword");
        mummy mummy = new mummy(6, "Kurt Place", "Spade");

        zombie.attack();
        mummy.attack();

        zombie.progressSaver();
        mummy.progressSaver();
    }
}
