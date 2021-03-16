public class Human {

    protected int health;
    protected int strength;
    protected int intelligence;
    protected int stealth;
    private static int defaultHealth = 100;
    private static int defaultStrength = 3;
    private static int defaultIntelligence = 3;
    private static int defaultStealth = 3;

    public Human() {
        this.health = defaultHealth;
        this.intelligence = defaultIntelligence;
        this.stealth = defaultStealth;
        this.strength = defaultStrength;
    }

    public void attack(Human donald) {
        donald.health -= this.strength;
    }

    public int displayHealth() {
        int dspHealth = this.health;
        System.out.println("Reamaining Health: " + dspHealth);
        return dspHealth;
    }

}
