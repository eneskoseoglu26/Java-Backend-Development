public class Boxer {
    private String name;
    private int health;
    private int damage;
    private int weight;
    private double blockChance;

    public Boxer(String name, int health, int damage, int weight, double blockChance) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.weight = weight;
        this.blockChance = blockChance;
    }

    public int punch(Boxer rival) {
        System.out.println();
        System.out.println(this.name + " attacked to " + rival.name);

        if(isBlocked()) {
            System.out.println(rival.name + " blocked the punch! NO DAMAGE!");
            return rival.health;
        } else {
            System.out.println(this.name + " PUNCHED to " + rival.name + "!");
        }

        if(rival.health - this.damage < 0) {
            return 0;
        }

        return rival.health - this.damage;
    }

    public boolean isBlocked() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.blockChance;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getBlockChance() {
        return blockChance;
    }

    public void setBlockChance(double blockChance) {
        this.blockChance = blockChance;
    }
}
