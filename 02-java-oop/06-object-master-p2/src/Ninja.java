public class Ninja extends Human {

    private int defaultStealth = 10;
    private static int count = 0;
    private final String name;

    public Ninja(String name) {
        this.name = name;
        this.stealth = defaultStealth;
        count += 1;
    }

    public void steal(Human unlucky) {
        unlucky.health -= this.stealth;
        this.health += this.stealth;
    }

    public void runAway() {
        this.health -= 10;
    }

    public static void howMany() {
        System.out.println("Total Ninjas: " + count);
    }

    public void displayNinja() {
        int health = this.health;
        int strength = this.strength;
        int intelect = this.intelligence;
        int stealth = this.stealth;
        System.out.println(this.name + " Health: " + health + " Strength: " + strength + " Intelect: " + intelect + " Stealth: " + stealth);
    }
}
