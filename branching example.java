import java.util.Random;

public class BranchingExample {

    public static void breakForLabeled() {
        Random random = new Random();
        int breakAT = random.nextInt(100);

        outer:
        for (int x = 1; x < 5; x++) {
            System.out.println("Starting point for x: " + x);
            inner:
            for (int i = 0; i < 100; i++) {
                if (i == breakAT) {
                    System.out.println("Random number was: " + breakAT);
                    break outer;
                } else {
                    break;
                }
            }

        }
    }

    public static void continueFor() {

        // this for loop will only print out odd numbers
        //due to the continue use inside of the if statement
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("the value of index is: " + i);
        }
    }

    public static void returnNothing(int x) {
        if (x > 3) {
            System.out.println("X is greater than 3, exciting method...");
            return;
        }

        System.out.println("This is below my return");
    }

    public static void returnXorReturnZero(int x) {
        if (x > 3) {
            System.out.println("X is greater than 3, exciting method with value...");
            return /* x */;
        }
    }
}
