public class HumanTest {

    public static void main(String[] args) {
        Ninja ninja1 = new Ninja("ninja1");
        Wizard wizard1 = new Wizard("wizard1");
        Samurai samurai1 = new Samurai("samurai1");

        ninja1.displayNinja();
        ninja1.steal(ninja1);
        ninja1.runAway();
        ninja1.displayNinja();

        wizard1.displayWizard();
        wizard1.fireball(wizard1);
        wizard1.displayWizard();

        samurai1.displaySamurai();
        samurai1.meditate();
        samurai1.deathBlow(samurai1);
        samurai1.displaySamurai();

        Ninja.howMany();
        Wizard.howMany();
        Samurai.howMany();
    }
}
