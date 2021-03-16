public class Wizard extends Human {

    private int defaultIntelligence = 8;
    private int defaultHealth = 50;
    private static int count = 0;
    private final String name;

    public Wizard(String name) {
        this.name = name;
        this.health = defaultHealth;
        this.intelligence = defaultIntelligence;
        count += 1;
    }

    public void heal(Human lucky) {
        lucky.health += this.intelligence;
    }

    public void fireball(Human unlucky) {
        unlucky.health -= this.intelligence * 3;
    }

    public static void howMany() {
        System.out.println("Total Wizards: " + count);
    }

    public void displayWizard() {
        int health = this.health;
        int strength = this.strength;
        int intelect = this.intelligence;
        int stealth = this.stealth;
        System.out.println(this.name + " Health: " + health + " Strength: " + strength + " Intelect: " + intelect + " Stealth: " + stealth);
    }
}

