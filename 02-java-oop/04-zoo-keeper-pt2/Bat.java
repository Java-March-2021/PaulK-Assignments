public class Bat extends Mammal2 {

    private int defaultEnergyLevel = 300;

    public Bat() {
        this.energyLevel = defaultEnergyLevel;
    }

    public void fly() {
        this.energyLevel -= 50;
        System.out.println("Bat flies");
    }

    public void attackTowns() {
        this.energyLevel -= 100;
        System.out.println("Bat attacks town");
    }

    public void eatHumans() {
        this.energyLevel += 25;
        System.out.println("Bat eats humans");
    }
}
