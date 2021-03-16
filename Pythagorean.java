public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
        //Hypotenuse
        double c = (Math.pow(legA, 2)) + (Math.pow(legB, 2));
        c = Math.sqrt(c);
        System.out.println("Hypotenuse: " + c);
        return c;
    }

    public static void PyythagoreanTest() {
        String result = calculateHyprtenuse(4, 5);
            String output = String.format("Number: %d :: Result: %s", i, result);
            System.out.println(output);
        }
    }
}
