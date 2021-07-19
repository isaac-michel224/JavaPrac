import java.util.Scanner;

public class TypesandVariables {
    public static void main(String[] args) {

        //Simple Greeting
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, it's Me!");
      /*  String Greeting = input.nextLine();
        System.out.printf("Hey, %s \n", Greeting); */

        int number;

      //  Operators - Numbers

        int a = 6;
        int b = 3;

        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);

        System.out.println(++b);
        System.out.println(b);
        System.out.println(b++);

      //  a += b;

        b -= a;

        a *= b;

        b /= a;

        System.out.println(a += b);

        System.out.println(16 % 4); //remainder is 0, completely divisible
        System.out.println(16 % 6); //remainder is 4

        //  Operators - Logical
        
        //Errors
        /*if (sum > 13 && sum < 26) {
            System.out.println("Right in the sweet spot.");
        } else {
            System.out.println("Too litte, too much.");
        } */

        //Correct
        Scanner userInput = new Scanner(System.in);
        int bank = 10000;

        System.out.println("How much money is in your bank account");

       int cash = Integer.parseInt(userInput.nextLine());

       if (cash < bank) {
           System.out.println("You are broke, sir!");
           System.exit(0);

       } else {}









    }
}
