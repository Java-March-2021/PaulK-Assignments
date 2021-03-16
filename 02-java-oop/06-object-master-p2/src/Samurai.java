public class Samurai extends Human {

    private int defaultHealth = 200;
    private static int count = 0;
    private final String name;

    public Samurai(String name) {
        this.name = name;
        this.health = defaultHealth;
        count += 1;
    }

    public void deathBlow(Human unlucky) {
        unlucky.health = 0;
        int newHealth = this.health;
        this.health = newHealth / 2;
    }

    public void meditate() {
        this.health = defaultHealth;
    }

    public static void howMany() {
        System.out.println("Total Samurai: " + count);
    }

    public void displaySamurai() {
        int health = this.health;
        int strength = this.strength;
        int intelect = this.intelligence;
        int stealth = this.stealth;
        System.out.println(this.name + " Health: " + health + " Strength: " + strength + " Intelect: " + intelect + " Stealth: " + stealth);
    }
}
