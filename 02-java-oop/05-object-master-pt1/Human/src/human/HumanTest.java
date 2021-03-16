package human;

public class HumanTest {

    public static void main(String[] args) {
        Human dt = new Human();
        Human test = new Human();
        dt.attack(test);
        test.displayHealth();
    }
}
