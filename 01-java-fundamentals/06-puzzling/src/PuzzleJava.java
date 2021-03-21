
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {

    public static void main(String[] args) {
        String[] names = {"Nancy", "Jinchi", "Fujibayashi", "Momochi", "Ishikawa"};
        int[] numbers = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
        ArrayList<Character> alphabet = new ArrayList<Character>();
        ArrayList<Integer> randNosIn = new ArrayList<Integer>();

        arrayPuzzle(numbers);

        shuffleArray(names);

        alphabetPuzzle(alphabet);

        randomNos(randNosIn);

        randomNosSorted(randNosIn);

        getAlphaNumericString(5);

        getAlphaNumericStringTen(5);
    }

    public static ArrayList<Integer> arrayPuzzle(int[] numbers) {
        int sum = 0;
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] > 10) {
                newArr.add(numbers[i]);
                j++;
            }
        }
        System.out.println(sum + " is sum of numbers");
        System.out.println(newArr);
        return newArr;
    }

    public static void shuffleArray(Object[] arr) {
        Random r = new Random();
        String hold;
        for (int j = 0; j < arr.length; j++) {
            hold = (String) arr[j];
            if (hold.length() > 5) {
                System.out.println(hold);
            }
        }
        for (int i = 0; i < arr.length / 2; i++) {
            Object temp = arr[i];
            int randomIdx = r.nextInt(arr.length - i) + i;
            arr[i] = arr[randomIdx];
            arr[randomIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void alphabetPuzzle(ArrayList<Character> alphabet) {
        for (char alph = 'a'; alph <= 'z'; ++alph) {
            alphabet.add(alph);
        }
        Collections.shuffle(alphabet);
        System.out.println(alphabet);
        System.out.println("first letter " + alphabet.get(0));
        System.out.println("last letter " + alphabet.get(25));
        char first = alphabet.get(0);
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowels.length; i++) {
            if (first == vowels[i]) {
                System.out.println(alphabet.get(0) + " is a vowel");
            }
        }
    }

    public static ArrayList<Integer> randomNos(ArrayList<Integer> randNosIn) {
        for (int i = 55; i <= 100; i++) {
            randNosIn.add(i);
        }
        Random random = new Random();
        ArrayList<Integer> randNos = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int value = random.nextInt(45);
            randNos.add(randNosIn.get(value));
        }
        System.out.println(randNos);
        return randNos;
    }

    public static ArrayList<Integer> randomNosSorted(ArrayList<Integer> randNosIn) {
        for (int i = 55; i <= 100; i++) {
            randNosIn.add(i);
        }
        Random random = new Random();
        ArrayList<Integer> randNos = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int value = random.nextInt(45);
            randNos.add(randNosIn.get(value));
        }
        System.out.println(randNos);
        Collections.sort(randNos);
        System.out.println(randNos);
        return randNos;
    }

    public static String getAlphaNumericString(int n) {

        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        System.out.println(sb);
        return sb.toString();
    }

    public static String getAlphaNumericStringTen(int n) {

        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(n);
        ArrayList<String> sb10 = new ArrayList<String>();
        for (int j = 1; j <= 10; j++) {
            for (int i = 0; i < n; i++) {
                int index
                        = (int) (AlphaNumericString.length()
                        * Math.random());
                sb.append(AlphaNumericString.charAt(index));
            }
            sb10.add(sb.toString());
            sb.delete(0,  sb.length());
        }
        System.out.println(sb10);
        return sb.toString();
    }
}